package sun.xiaolei.pgyer

class PgyerConfig {
    /**
     * _api_key	String	(必填) API Key 点击获取_api_key
     * file	File	(必填) 需要上传的ipa或者apk文件
     * buildInstallType	Integer	(选填)应用安装方式，值为(1,2,3，4)。1：公开，2：密码安装，3：邀请安装，4：回答问题安装。默认为1公开
     * buildPassword	String	(选填) 设置App安装密码，如果不想设置密码，请传空字符串，或不传。
     * buildUpdateDescription	String	(选填) 版本更新描述，请传空字符串，或不传。
     * buildName	String	(选填) 应用名称
     * buildInstallQuestoin	String	(选填)如果安装方式为回答问题安装，填写安装问题。
     * buildInstallAnswer	String	(选填)如果安装方式为回答问题安装，填写安装问题的答案。
     * buildInstallDate	Interger	(选填)是否设置安装有效期，值为：1 设置有效时间， 2 长期有效，如果不填写不修改上一次的设置
     * buildInstallStartDate	String	(选填)安装有效期开始时间，字符串型，如：2018-01-01
     * buildInstallEndDate	String	(选填)安装有效期结束时间，字符串型，如：2018-12-31
     */

    String _api_key = ""
    String apkName = ""
    String apkPath = ""
    String buildInstallType = "1"
    String buildPassword = ""
    String buildUpdateDescription = ""
    String buildName = ""
    String buildInstallQuestoin = ""
    String buildInstallAnswer = ""
    String buildInstallDate = ""
    String buildInstallStartDate = ""
    String buildInstallEndDate = ""
}

