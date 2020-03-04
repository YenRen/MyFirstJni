
LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := MyJniTest

LOCAL_SRC_FILES := MyJniTest.c

include $(BUILD_SHARED_LIBRARY)
