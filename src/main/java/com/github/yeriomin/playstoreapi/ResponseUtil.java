package com.github.yeriomin.playstoreapi;

        import com.google.protobuf.InvalidProtocolBufferException;

public class ResponseUtil {

    public static Payload payload(ResponseWrapper responseWrapper) {
        if (responseWrapper != null && responseWrapper.hasPayload()) {
            return responseWrapper.getPayload();
        }
        return Payload.getDefaultInstance();
    }

    public static SearchResponse searchResponse(ResponseWrapper responseWrapper) {
        Payload payload = payload(responseWrapper);
        if (payload(responseWrapper).hasSearchResponse()) {
            return payload.getSearchResponse();
        }
        return SearchResponse.getDefaultInstance();
    }

    public static ListResponse listResponse(ResponseWrapper responseWrapper) {
        Payload payload = payload(responseWrapper);
        if (payload.hasListResponse()) {
            return payload.getListResponse();
        }
        return ListResponse.getDefaultInstance();
    }

    public static DeliveryResponse deliveryResponse(ResponseWrapper responseWrapper) {
        Payload payload = payload(responseWrapper);
        if (payload.hasDeliveryResponse()) {
            return payload.getDeliveryResponse();
        }
        return DeliveryResponse.getDefaultInstance();
    }

    public static BulkDetailsResponse bulkDetailsResponse(ResponseWrapper responseWrapper) {
        Payload payload = payload(responseWrapper);
        if (payload.hasBulkDetailsResponse()) {
            return payload.getBulkDetailsResponse();
        }
        return BulkDetailsResponse.getDefaultInstance();
    }

    public static DetailsResponse detailsResponse(ResponseWrapper responseWrapper) {
        Payload payload = payload(responseWrapper);
        if (payload.hasDetailsResponse()) {
            return payload.getDetailsResponse();
        }
        return DetailsResponse.getDefaultInstance();
    }

    public static TocResponse tocResponse(ResponseWrapper responseWrapper) {
        Payload payload = payload(responseWrapper);
        if (payload.hasTocResponse()) {
            return payload.getTocResponse();
        }
        return TocResponse.getDefaultInstance();
    }

    public static UploadDeviceConfigResponse uploadDeviceConfigResponse(ResponseWrapper responseWrapper) {
        Payload payload = payload(responseWrapper);
        if (payload.hasUploadDeviceConfigResponse()) {
            return payload.getUploadDeviceConfigResponse();
        }
        return UploadDeviceConfigResponse.getDefaultInstance();
    }
}
