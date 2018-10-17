package sun.xiaolei.pgyer

class UploadResponse {

    /**
     * code : 0
     * message : 
     * data : {"buildKey":"eaf91ffe7955b92d6814fa20c164758d","buildType":"2","buildIsFirst":"0","buildIsLastest":"1","buildFileKey":"a66c42d5acda54ef45fb542bbcf4fbf0.apk","buildFileName":"agency_debug_2018101713.apk","buildFileSize":"5384898","buildName":"FXAPP Test","buildVersion":"1.1","buildVersionNo":"11","buildBuildVersion":"5","buildIdentifier":"com.centalineproperty.test","buildIcon":"f23bd93e7573d038c1cb8974c4d56465","buildDescription":"","buildUpdateDescription":"","buildScreenshots":"","buildShortcutUrl":"tttest","buildCreated":"2018-10-17 13:06:38","buildUpdated":"2018-10-17 13:06:38","buildQRCodeURL":"https://www.pgyer.com/app/qrcodeHistory/260b98e3f7e04bf361716d5468d1ed43a9cd260422c6a53c84542cfa008f5a8a"}*/

    private int code;
    private String message;
    private DataBean data;

    int getCode() {
        return code;
    }

    void setCode(int code) {
        this.code = code;
    }

    String getMessage() {
        return message;
    }

    void setMessage(String message) {
        this.message = message;
    }

    DataBean getData() {
        return data;
    }

    void setData(DataBean data) {
        this.data = data;
    }

    static class DataBean {
        /**
         * buildKey	String	Build Key是唯一标识应用的索引ID
         * buildType	Integer	应用类型（1:iOS; 2:Android）
         * buildIsFirst	Integer	是否是第一个App（1:是; 2:否）
         * buildIsLastest	Integer	是否是最新版（1:是; 2:否）
         * buildFileSize	Integer	App 文件大小
         * buildName	String	应用名称
         * buildVersion	String	版本号, 默认为1.0 (是应用向用户宣传时候用到的标识，例如：1.1、8.2.1等。)
         * buildVersionNo	String	上传包的版本编号，默认为1 (即编译的版本号，一般来说，编译一次会变动一次这个版本号, 在 Android 上叫 Version Code。对于 iOS 来说，是字符串类型；对于 Android 来说是一个整数。例如：1001，28等。)
         * buildBuildVersion	Integer	蒲公英生成的用于区分历史版本的build号
         * buildIdentifier	String	应用程序包名，iOS为BundleId，Android为包名
         * buildIcon	String	应用的Icon图标key，访问地址为 https://www.pgyer.com/image/view/app_icons/[应用的Icon图标key]
         * buildDescription	String	应用介绍
         * buildUpdateDescription	String	应用更新说明
         * buildScreenShots	String	应用截图的key，获取地址为 https://www.pgyer.com/image/view/app_screenshots/[应用截图的key]
         * buildShortcutUrl	String	应用短链接
         * buildQRCodeURL	String	应用二维码地址
         * buildCreated	String	应用上传时间
         * buildUpdated	String	应用更新时间
         */

        private String buildKey;
        private String buildType;
        private String buildIsFirst;
        private String buildIsLastest;
        private String buildFileKey;
        private String buildFileName;
        private String buildFileSize;
        private String buildName;
        private String buildVersion;
        private String buildVersionNo;
        private String buildBuildVersion;
        private String buildIdentifier;
        private String buildIcon;
        private String buildDescription;
        private String buildUpdateDescription;
        private String buildScreenshots;
        private String buildShortcutUrl;
        private String buildCreated;
        private String buildUpdated;
        private String buildQRCodeURL;

        String getBuildKey() {
            return buildKey;
        }

        void setBuildKey(String buildKey) {
            this.buildKey = buildKey;
        }

        String getBuildType() {
            return buildType;
        }

        void setBuildType(String buildType) {
            this.buildType = buildType;
        }

        String getBuildIsFirst() {
            return buildIsFirst;
        }

        void setBuildIsFirst(String buildIsFirst) {
            this.buildIsFirst = buildIsFirst;
        }

        String getBuildIsLastest() {
            return buildIsLastest;
        }

        void setBuildIsLastest(String buildIsLastest) {
            this.buildIsLastest = buildIsLastest;
        }

        String getBuildFileKey() {
            return buildFileKey;
        }

        void setBuildFileKey(String buildFileKey) {
            this.buildFileKey = buildFileKey;
        }

        String getBuildFileName() {
            return buildFileName;
        }

        void setBuildFileName(String buildFileName) {
            this.buildFileName = buildFileName;
        }

        String getBuildFileSize() {
            return buildFileSize;
        }

        void setBuildFileSize(String buildFileSize) {
            this.buildFileSize = buildFileSize;
        }

        String getBuildName() {
            return buildName;
        }

        void setBuildName(String buildName) {
            this.buildName = buildName;
        }

        String getBuildVersion() {
            return buildVersion;
        }

        void setBuildVersion(String buildVersion) {
            this.buildVersion = buildVersion;
        }

        String getBuildVersionNo() {
            return buildVersionNo;
        }

        void setBuildVersionNo(String buildVersionNo) {
            this.buildVersionNo = buildVersionNo;
        }

        String getBuildBuildVersion() {
            return buildBuildVersion;
        }

        void setBuildBuildVersion(String buildBuildVersion) {
            this.buildBuildVersion = buildBuildVersion;
        }

        String getBuildIdentifier() {
            return buildIdentifier;
        }

        void setBuildIdentifier(String buildIdentifier) {
            this.buildIdentifier = buildIdentifier;
        }

        String getBuildIcon() {
            return buildIcon;
        }

        void setBuildIcon(String buildIcon) {
            this.buildIcon = buildIcon;
        }

        String getBuildDescription() {
            return buildDescription;
        }

        void setBuildDescription(String buildDescription) {
            this.buildDescription = buildDescription;
        }

        String getBuildUpdateDescription() {
            return buildUpdateDescription;
        }

        void setBuildUpdateDescription(String buildUpdateDescription) {
            this.buildUpdateDescription = buildUpdateDescription;
        }

        String getBuildScreenshots() {
            return buildScreenshots;
        }

        void setBuildScreenshots(String buildScreenshots) {
            this.buildScreenshots = buildScreenshots;
        }

        String getBuildShortcutUrl() {
            return buildShortcutUrl;
        }

        void setBuildShortcutUrl(String buildShortcutUrl) {
            this.buildShortcutUrl = buildShortcutUrl;
        }

        String getBuildCreated() {
            return buildCreated;
        }

        void setBuildCreated(String buildCreated) {
            this.buildCreated = buildCreated;
        }

        String getBuildUpdated() {
            return buildUpdated;
        }

        void setBuildUpdated(String buildUpdated) {
            this.buildUpdated = buildUpdated;
        }

        String getBuildQRCodeURL() {
            return buildQRCodeURL;
        }

        void setBuildQRCodeURL(String buildQRCodeURL) {
            this.buildQRCodeURL = buildQRCodeURL;
        }
    }
}
