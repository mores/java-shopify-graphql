package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MarketingActivityUpdateExternalInput;
import com.shopify.types.UTMInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


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

    
    public Builder input(MarketingActivityUpdateExternalInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    
    public Builder marketingActivityId(String marketingActivityId) {
      this.marketingActivityId = marketingActivityId;
      this.fieldsSet.add("marketingActivityId");
      return this;
    }

    
    public Builder remoteId(String remoteId) {
      this.remoteId = remoteId;
      this.fieldsSet.add("remoteId");
      return this;
    }

    
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
