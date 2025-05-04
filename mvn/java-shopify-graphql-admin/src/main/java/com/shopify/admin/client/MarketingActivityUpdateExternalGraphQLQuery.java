package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MarketingActivityUpdateExternalInput;
import com.shopify.admin.types.UTMInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Update an external marketing activity.
 */
public class MarketingActivityUpdateExternalGraphQLQuery extends GraphQLQuery {
  public MarketingActivityUpdateExternalGraphQLQuery(MarketingActivityUpdateExternalInput input,
      String marketingActivityId, String remoteId, UTMInput utm, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }if (marketingActivityId != null || fieldsSet.contains("marketingActivityId")) {
        getInput().put("marketingActivityId", marketingActivityId);
    }if (remoteId != null || fieldsSet.contains("remoteId")) {
        getInput().put("remoteId", remoteId);
    }if (utm != null || fieldsSet.contains("utm")) {
        getInput().put("utm", utm);
    }
  }

  public MarketingActivityUpdateExternalGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "marketingActivityUpdateExternal";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private MarketingActivityUpdateExternalInput input;

    private String marketingActivityId;

    private String remoteId;

    private UTMInput utm;

    private String queryName;

    public MarketingActivityUpdateExternalGraphQLQuery build() {
      return new MarketingActivityUpdateExternalGraphQLQuery(input, marketingActivityId, remoteId, utm, queryName, fieldsSet);
               
    }

    /**
     * The input field for updating an external marketing activity.
     */
    public Builder input(MarketingActivityUpdateExternalInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The ID of the marketing activity. Specify either the marketing activity ID,
     * remote ID, or UTM to update the marketing activity.
     */
    public Builder marketingActivityId(String marketingActivityId) {
      this.marketingActivityId = marketingActivityId;
      this.fieldsSet.add("marketingActivityId");
      return this;
    }

    /**
     * A custom unique identifier for the marketing activity, which can be used to
     * manage the activity and send engagement metrics without having to store our
     * marketing activity ID in your systems. Specify either the marketing activity
     * ID, remote ID, or UTM to update the marketing activity.
     */
    public Builder remoteId(String remoteId) {
      this.remoteId = remoteId;
      this.fieldsSet.add("remoteId");
      return this;
    }

    /**
     * Specifies the [Urchin Traffic Module (UTM)
     * parameters](https://en.wikipedia.org/wiki/UTM_parameters) that are
     * associated with a related marketing campaign. Specify either the marketing
     * activity ID, remote ID, or UTM to update the marketing activity.
     */
    public Builder utm(UTMInput utm) {
      this.utm = utm;
      this.fieldsSet.add("utm");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
