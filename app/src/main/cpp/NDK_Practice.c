//
// Created by james on 2018/6/26.
//
#include "com_james_ndk_practice_NDKPracticeActivity.h"

JNIEXPORT jstring JNICALL Java_com_james_ndk_1practice_NDKPracticeActivity_getStringFromC
        (JNIEnv *env, jclass jcls){

    char *c = "ndk practice";

    return  (*env)->NewStringUTF(env,c);

}




