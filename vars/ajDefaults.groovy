#!/usr/bin/groovy

def initDefaults() {
    if("${env.AJ_DEBUG_MODE}" != "true" && "${env.AJ_DEBUG_MODE}" != "false") {
        env.AJ_DEBUG_MODE="false"
    }
    if (!env.AJ_DEFAULT_GIT_CREDENTIAL) {
        env.AJ_DEFAULT_GIT_CREDENTIAL="gitsshkey"
    }
    if (!env.AJ_DEFAULT_JDK_TOOL_NAME) {
        env.AJ_DEFAULT_JDK_TOOL_NAME="jdk"
    }
    if (!env.AJ_DEFAULT_MAVEN_TOOL_NAME) {
        env.AJ_DEFAULT_MAVEN_TOOL_NAME="maven"
    }
    if (!env.AJ_DEFAULT_MAVEN_SETTINGS_FILE_CONFIG_NAME) {
        env.AJ_DEFAULT_MAVEN_SETTINGS_FILE_CONFIG_NAME="maven-settings"
    }
}

def isDebugMode() {
    if("${env.AJ_DEBUG_MODE}" != "true" && "${env.AJ_DEBUG_MODE}" != "false") {
        initDefaults()
    }
    if("${env.AJ_DEBUG_MODE}" == "true") {
        return true
    }
    return false
}

def defaultGitCredential() {
    if (!env.AJ_DEFAULT_GIT_CREDENTIAL) {
        initDefaults()
    }
    return env.AJ_DEFAULT_GIT_CREDENTIAL
}

def defaultJdkTool() {
    if (!env.AJ_DEFAULT_JDK_TOOL_NAME) {
        initDefaults()
    }
    return env.AJ_DEFAULT_JDK_TOOL_NAME
}

def defaultMavenTool() {
    if (!env.AJ_DEFAULT_MAVEN_TOOL_NAME) {
        initDefaults()
    }
    return env.AJ_DEFAULT_MAVEN_TOOL_NAME
}

def defaultMavenSetting() {
    if (!env.AJ_DEFAULT_MAVEN_TOOL_NAME) {
        initDefaults()
    }
    return env.AJ_DEFAULT_MAVEN_TOOL_NAME
}
