package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.FulfillmentTrackingInput;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates tracking information for a fulfillment, including the carrier name,
 * tracking numbers, and tracking URLs. You can provide either single or multiple
 * tracking numbers for shipments with multiple packages.
 *   
 * The mutation accepts a [`FulfillmentTrackingInput`](https://shopify.dev/docs/api/admin-graphql/latest/input-objects/FulfillmentTrackingInput)
 * that supports both single tracking (using [`number`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/fulfillmentTrackingInfoUpdate#arguments-trackingInfoInput.fields.number) and [`url`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/fulfillmentTrackingInfoUpdate#arguments-trackingInfoInput.fields.url)
 * fields) and multi-package tracking (using [`numbers`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/fulfillmentTrackingInfoUpdate#arguments-trackingInfoInput.fields.numbers) and [`urls`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/fulfillmentTrackingInfoUpdate#arguments-trackingInfoInput.fields.urls)
 * fields). When you specify a [supported carrier name](https://shopify.dev/docs/api/admin-graphql/latest/objects/FulfillmentTrackingInfo#supported-tracking-companies),
 * Shopify automatically generates tracking URLs for the provided tracking numbers.
 *   
 * You can optionally notify customers about tracking updates with the [`notifyCustomer`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/fulfillmentTrackingInfoUpdate#arguments-notifyCustomer)
 * argument. When enabled, customers receive shipping update emails with tracking
 * details and receive notifications about future updates to the fulfillment.
 *   
 * Learn more about [enabling tracking support](https://shopify.dev/docs/apps/build/orders-fulfillment/fulfillment-service-apps/build-for-fulfillment-services#step-9-optional-enable-tracking-support)
 * for fulfillment services.
 */
public class FulfillmentTrackingInfoUpdateGraphQLQuery extends GraphQLQuery {
  public FulfillmentTrackingInfoUpdateGraphQLQuery(String fulfillmentId,
      FulfillmentTrackingInput trackingInfoInput, Boolean notifyCustomer, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (fulfillmentId != null || fieldsSet.contains("fulfillmentId")) {
        getInput().put("fulfillmentId", fulfillmentId);
    }if (trackingInfoInput != null || fieldsSet.contains("trackingInfoInput")) {
        getInput().put("trackingInfoInput", trackingInfoInput);
    }if (notifyCustomer != null || fieldsSet.contains("notifyCustomer")) {
        getInput().put("notifyCustomer", notifyCustomer);
    }
  }

  public FulfillmentTrackingInfoUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentTrackingInfoUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String fulfillmentId;

    private FulfillmentTrackingInput trackingInfoInput;

    private Boolean notifyCustomer;

    private String queryName;

    public FulfillmentTrackingInfoUpdateGraphQLQuery build() {
      return new FulfillmentTrackingInfoUpdateGraphQLQuery(fulfillmentId, trackingInfoInput, notifyCustomer, queryName, fieldsSet);
               
    }

    /**
     * The ID of the fulfillment.
     */
    public Builder fulfillmentId(String fulfillmentId) {
      this.fulfillmentId = fulfillmentId;
      this.fieldsSet.add("fulfillmentId");
      return this;
    }

    /**
     * The tracking input for the mutation, including tracking URL, number, and company.
     */
    public Builder trackingInfoInput(FulfillmentTrackingInput trackingInfoInput) {
      this.trackingInfoInput = trackingInfoInput;
      this.fieldsSet.add("trackingInfoInput");
      return this;
    }

    /**
     * Whether the customer will be notified of this update and future updates for the fulfillment.
     * If this field is left blank, then notifications won't be sent to the customer when the fulfillment is updated.
     */
    public Builder notifyCustomer(Boolean notifyCustomer) {
      this.notifyCustomer = notifyCustomer;
      this.fieldsSet.add("notifyCustomer");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
