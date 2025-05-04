package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.AbandonmentDeliveryState;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates the marketing activities delivery statuses for an abandonment.
 */
public class AbandonmentUpdateActivitiesDeliveryStatusesGraphQLQuery extends GraphQLQuery {
  public AbandonmentUpdateActivitiesDeliveryStatusesGraphQLQuery(String abandonmentId,
      String marketingActivityId, AbandonmentDeliveryState deliveryStatus,
      OffsetDateTime deliveredAt, String deliveryStatusChangeReason, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (abandonmentId != null || fieldsSet.contains("abandonmentId")) {
        getInput().put("abandonmentId", abandonmentId);
    }if (marketingActivityId != null || fieldsSet.contains("marketingActivityId")) {
        getInput().put("marketingActivityId", marketingActivityId);
    }if (deliveryStatus != null || fieldsSet.contains("deliveryStatus")) {
        getInput().put("deliveryStatus", deliveryStatus);
    }if (deliveredAt != null || fieldsSet.contains("deliveredAt")) {
        getInput().put("deliveredAt", deliveredAt);
    }if (deliveryStatusChangeReason != null || fieldsSet.contains("deliveryStatusChangeReason")) {
        getInput().put("deliveryStatusChangeReason", deliveryStatusChangeReason);
    }
  }

  public AbandonmentUpdateActivitiesDeliveryStatusesGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "abandonmentUpdateActivitiesDeliveryStatuses";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String abandonmentId;

    private String marketingActivityId;

    private AbandonmentDeliveryState deliveryStatus;

    private OffsetDateTime deliveredAt;

    private String deliveryStatusChangeReason;

    private String queryName;

    public AbandonmentUpdateActivitiesDeliveryStatusesGraphQLQuery build() {
      return new AbandonmentUpdateActivitiesDeliveryStatusesGraphQLQuery(abandonmentId, marketingActivityId, deliveryStatus, deliveredAt, deliveryStatusChangeReason, queryName, fieldsSet);
               
    }

    /**
     * The ID of the abandonment that needs to be updated.
     */
    public Builder abandonmentId(String abandonmentId) {
      this.abandonmentId = abandonmentId;
      this.fieldsSet.add("abandonmentId");
      return this;
    }

    /**
     * The ID of the marketing activity that needs to be updated.
     */
    public Builder marketingActivityId(String marketingActivityId) {
      this.marketingActivityId = marketingActivityId;
      this.fieldsSet.add("marketingActivityId");
      return this;
    }

    /**
     * The new delivery status of the marketing activity for this abandonment.
     */
    public Builder deliveryStatus(AbandonmentDeliveryState deliveryStatus) {
      this.deliveryStatus = deliveryStatus;
      this.fieldsSet.add("deliveryStatus");
      return this;
    }

    /**
     * The delivery timestamp if the activity delivered.
     */
    public Builder deliveredAt(OffsetDateTime deliveredAt) {
      this.deliveredAt = deliveredAt;
      this.fieldsSet.add("deliveredAt");
      return this;
    }

    /**
     * The reason why the activity was or was not delivered.
     */
    public Builder deliveryStatusChangeReason(String deliveryStatusChangeReason) {
      this.deliveryStatusChangeReason = deliveryStatusChangeReason;
      this.fieldsSet.add("deliveryStatusChangeReason");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
