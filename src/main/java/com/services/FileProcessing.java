package com.services;

import com.models.LogCache;
import com.models.LogQueue;

public interface FileProcessing {
    String readLine();
    LogQueue parthLogQueue();
    LogCache parthLogCache();
}
