package com.models;

public enum QueueAttr {
    ENQUEUE_COUNT("EnqueueCount"),
    DEQUEUE_COUNT("DequeueCount"),
    QUEUE_SIZE("QueueSize"),
    IN_FLIGHTCOUNT("InFlightCount"),
    AVERAGE_ENQUEUE_TIME("AverageEnqueueTime");

    private String attr;

    QueueAttr(String attr){
        this.attr = attr;
    }
}
