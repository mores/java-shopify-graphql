package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.ShopPayPaymentRequestInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Submits a Shop Pay payment request session.
 */
public class ShopPayPaymentRequestSessionSubmitGraphQLQuery extends GraphQLQuery {
  public ShopPayPaymentRequestSessionSubmitGraphQLQuery(String idempotencyKey, String orderName,
      ShopPayPaymentRequestInput paymentRequest, String token, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (idempotencyKey != null || fieldsSet.contains("idempotencyKey")) {
        getInput().put("idempotencyKey", idempotencyKey);
    }if (orderName != null || fieldsSet.contains("orderName")) {
        getInput().put("orderName", orderName);
    }if (paymentRequest != null || fieldsSet.contains("paymentRequest")) {
        getInput().put("paymentRequest", paymentRequest);
    }if (token != null || fieldsSet.contains("token")) {
        getInput().put("token", token);
    }
  }

  public ShopPayPaymentRequestSessionSubmitGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "shopPayPaymentRequestSessionSubmit";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String idempotencyKey;

    private String orderName;

    private ShopPayPaymentRequestInput paymentRequest;

    private String token;

    private String queryName;

    public ShopPayPaymentRequestSessionSubmitGraphQLQuery build() {
      return new ShopPayPaymentRequestSessionSubmitGraphQLQuery(idempotencyKey, orderName, paymentRequest, token, queryName, fieldsSet);
               
    }

    /**
     * The idempotency key is used to guarantee an idempotent result.
     */
    public Builder idempotencyKey(String idempotencyKey) {
      this.idempotencyKey = idempotencyKey;
      this.fieldsSet.add("idempotencyKey");
      return this;
    }

    /**
     * The order name to be used for the order created from the payment request.
     */
    public Builder orderName(String orderName) {
      this.orderName = orderName;
      this.fieldsSet.add("orderName");
      return this;
    }

    /**
     * The final payment request object.
     */
    public Builder paymentRequest(ShopPayPaymentRequestInput paymentRequest) {
      this.paymentRequest = paymentRequest;
      this.fieldsSet.add("paymentRequest");
      return this;
    }

    /**
     * A token representing a payment session request.
     */
    public Builder token(String token) {
      this.token = token;
      this.fieldsSet.add("token");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
