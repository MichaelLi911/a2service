package com.mms.cloud.document;

public class WrappedEntity {

    private Object doc;

    public WrappedEntity(Object entity) {
        this.doc = entity;
    }

    public Object getDoc() {
        return doc;
    }
}
