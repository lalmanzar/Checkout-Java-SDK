// This class was generated on Thu, 16 May 2019 09:53:44 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// OrdersSaveRequest.java
// @version 0.1.0-dev+8fcb5f
// @type request
// @data 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
// DO NOT EDIT
package com.paypal.orders;

import com.braintreepayments.http.*;
import java.util.*;
import java.util.stream.Collectors;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * Saves an order. Supports multiple authorize and capture.
 */
public class OrdersSaveRequest extends HttpRequest<Order> {

    public OrdersSaveRequest(String orderId) {
        super("/v2/checkout/orders/{order_id}/save?", "POST", Order.class);
        try {
            path(path().replace("{order_id}", URLEncoder.encode(String.valueOf(orderId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    public OrdersSaveRequest payPalClientMetadataId(String payPalClientMetadataId) {
        header("PayPal-Client-Metadata-Id", String.valueOf(payPalClientMetadataId));
        return this;
    }
    
    public OrdersSaveRequest payPalRequestId(String payPalRequestId) {
        header("PayPal-Request-Id", String.valueOf(payPalRequestId));
        return this;
    }
    
    public OrdersSaveRequest prefer(String prefer) {
        header("Prefer", String.valueOf(prefer));
        return this;
    }
    
    
}
