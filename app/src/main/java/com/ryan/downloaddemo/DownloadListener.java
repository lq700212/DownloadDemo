package com.ryan.downloaddemo;

/**
 * Desction:
 * Author:ryan.lei
 * Date:2019-08-07 18:57
 */
public interface DownloadListener {
    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPaused();

    void onCanceled();
}
