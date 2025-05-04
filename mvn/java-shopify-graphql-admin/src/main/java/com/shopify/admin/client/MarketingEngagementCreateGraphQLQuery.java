package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MarketingEngagementInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a new marketing engagement for a marketing activity or a marketing channel.
 */
public class MarketingEngagementCreateGraphQLQuery extends GraphQLQuery {
  public MarketingEngagementCreateGraphQLQuery(String marketingActivityId, String remoteId,
      String channelHandle, MarketingEngagementInput marketingEngagement, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (marketingActivityId != null || fieldsSet.contains("marketingActivityId")) {
        getInput().put("marketingActivityId", marketingActivityId);
    }if (remoteId != null || fieldsSet.contains("remoteId")) {
        getInput().put("remoteId", remoteId);
    }if (channelHandle != null || fieldsSet.contains("channelHandle")) {
        getInput().put("channelHandle", channelHandle);
    }if (marketingEngagement != null || fieldsSet.contains("marketingEngagement")) {
        getInput().put("marketingEngagement", marketingEngagement);
    }
  }

  public MarketingEngagementCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "marketingEngagementCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String marketingActivityId;

    private String remoteId;

    private String channelHandle;

    private MarketingEngagementInput marketingEngagement;

    private String queryName;

    public MarketingEngagementCreateGraphQLQuery build() {
      return new MarketingEngagementCreateGraphQLQuery(marketingActivityId, remoteId, channelHandle, marketingEngagement, queryName, fieldsSet);
               
    }

    /**
     * The identifier of the marketing activity for which the engagement metrics
     * are being provided. This or the remoteId should be set when and only when
     * providing activity-level engagements. This should be nil when providing
     * channel-level engagements.
     */
    public Builder marketingActivityId(String marketingActivityId) {
      this.marketingActivityId = marketingActivityId;
      this.fieldsSet.add("marketingActivityId");
      return this;
    }

    /**
     * A custom unique identifier for the marketing activity, which can be used to
     * manage the activity and send engagement metrics without having to store our
     * marketing activity ID in your systems. This or the marketingActivityId
     * should be set when and only when providing activity-level engagements. This
     * should be nil when providing channel-level engagements.
     */
    public Builder remoteId(String remoteId) {
      this.remoteId = remoteId;
      this.fieldsSet.add("remoteId");
      return this;
    }

    /**
     * The unique string identifier of the channel to which the engagement metrics
     * are being provided. This should be set when and only when providing
     * channel-level engagements. This should be nil when providing activity-level
     * engagements. For the correct handle for your channel, contact your partner manager.
     */
    public Builder channelHandle(String channelHandle) {
      this.channelHandle = channelHandle;
      this.fieldsSet.add("channelHandle");
      return this;
    }

    /**
     * The marketing engagement's attributes.
     */
    public Builder marketingEngagement(MarketingEngagementInput marketingEngagement) {
      this.marketingEngagement = marketingEngagement;
      this.fieldsSet.add("marketingEngagement");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
