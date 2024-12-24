package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.AbandonmentDeliveryState;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;


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

    
    public Builder abandonmentId(String abandonmentId) {
      this.abandonmentId = abandonmentId;
      this.fieldsSet.add("abandonmentId");
      return this;
    }

    
    public Builder marketingActivityId(String marketingActivityId) {
      this.marketingActivityId = marketingActivityId;
      this.fieldsSet.add("marketingActivityId");
      return this;
    }

    
    public Builder deliveryStatus(AbandonmentDeliveryState deliveryStatus) {
      this.deliveryStatus = deliveryStatus;
      this.fieldsSet.add("deliveryStatus");
      return this;
    }

    
    public Builder deliveredAt(OffsetDateTime deliveredAt) {
      this.deliveredAt = deliveredAt;
      this.fieldsSet.add("deliveredAt");
      return this;
    }

    
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
