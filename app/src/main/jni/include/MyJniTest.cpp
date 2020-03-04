//
// Created by admin on 2020/3/4.
//

#include "com_keda_first_MyJniTest.h"

JNIEXPORT jstring JNICALL Java_com_keda_firstjni_MyJniTest_getString
  (JNIEnv * env, jobject thiz){
  return (*env)->NewStringUTF(env,"Hello World From Jni");
 }