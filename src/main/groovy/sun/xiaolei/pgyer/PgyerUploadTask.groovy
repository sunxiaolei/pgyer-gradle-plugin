package sun.xiaolei.pgyer

import com.google.gson.Gson
import okhttp3.Call
import okhttp3.Callback
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.Response
import okhttp3.ResponseBody
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class PgyerUploadTask extends DefaultTask {

    final String uploadUrl = "https://www.pgyer.com/apiv2/app/upload"

    PgyerUploadTask() {
        super()
        dependsOn('assembleDebug')
    }

    @TaskAction
    def upload() {
        println 'pgyer::=====>开始上传至蒲公英'
        String apkPath = project.pgyer_config.apkPath
        String apkName = project.pgyer_config.apkName
        String key = project.pgyer_config._api_key
        String buildInstallType = project.pgyer_config.buildInstallType
        String buildPassword = project.pgyer_config.buildPassword
        String buildUpdateDescription = project.pgyer_config.buildUpdateDescription
        String buildName = project.pgyer_config.buildName
        String buildInstallQuestoin = project.pgyer_config.buildInstallQuestoin
        String buildInstallAnswer = project.pgyer_config.buildInstallAnswer
        String buildInstallDate = project.pgyer_config.buildInstallDate
        String buildInstallStartDate = project.pgyer_config.buildInstallStartDate
        String buildInstallEndDate = project.pgyer_config.buildInstallEndDate
        println 'pgyer::=====>apkPath:' + apkPath
        println 'pgyer::=====>apkName:' + apkName
        println 'pgyer::=====>apikey:' + key
        println 'pgyer::=====>uploadUrl:' + uploadUrl
        RequestBody body = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("file", apkName, RequestBody.create(MediaType.parse("file/*"), new File(apkPath + File.separator + apkName)))
                .addFormDataPart("_api_key", key)
                .addFormDataPart("buildInstallType", buildInstallType)
                .addFormDataPart("buildPassword", buildPassword)
                .addFormDataPart("buildUpdateDescription", buildUpdateDescription)
                .addFormDataPart("buildName", buildName)
                .addFormDataPart("buildInstallQuestoin", buildInstallQuestoin)
                .addFormDataPart("buildInstallAnswer", buildInstallAnswer)
                .addFormDataPart("buildInstallDate", buildInstallDate)
                .addFormDataPart("buildInstallStartDate", buildInstallStartDate)
                .addFormDataPart("buildInstallEndDate", buildInstallEndDate)
                .build()
        OkHttpClient client = new OkHttpClient()
        Request request = new Request.Builder()
                .url(uploadUrl)
                .addHeader("content-type", "application/x-www-form-urlencoded")
                .post(body)
                .build()
        Response response = client.newCall(request).execute()
        int code = response.code();
        if (code == 200) {
            ResponseBody resBody = response.body();//获取响应体
            String str = resBody.string();//获取字符串数据
            UploadResponse res = new Gson().fromJson(str, UploadResponse.class)
            if (res.code == 0) {
                println 'pgyer::=====>上传成功'
                UploadResponse.DataBean data = res.data
                println 'pgyer::=====>应用名:' + data.buildName
                println 'pgyer::=====>版本号:' + data.buildVersion
                println 'pgyer::=====>应用大小:' + data.buildFileSize
                println 'pgyer::=====>更新说明:' + data.buildUpdateDescription
                println 'pgyer::=====>下载地址:https://www.pgyer.com/' + data.buildShortcutUrl

            } else {
                println 'pgyer::=====>上传失败:code:' + res.code.toString() + '    message:' + res.message
            }
        } else {
            println 'pgyer::=====>上传失败:' + code.toString()
        }
    }
}
