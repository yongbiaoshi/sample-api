package com.my.sample.api.service;

public interface TraceTestService {

    void log() throws InterruptedException;

    void asyncLog() throws InterruptedException;
}
