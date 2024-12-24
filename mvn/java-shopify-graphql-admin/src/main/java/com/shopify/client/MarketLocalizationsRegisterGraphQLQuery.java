package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MarketLocalizationRegisterInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class MarketLocalizationsRegisterGraphQLQuery extends GraphQLQuery {
  public MarketLocalizationsRegisterGraphQLQuery(String resourceId,
      List<MarketLocalizationRegisterInput> marketLocalizations, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (resourceId != null || fieldsSet.contains("resourceId")) {
        getInput().put("resourceId", resourceId);
    }if (marketLocalizations != null || fieldsSet.contains("marketLocalizations")) {
        getInput().put("marketLocalizations", marketLocalizations);
    }
  }

  public MarketLocalizationsRegisterGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "marketLocalizationsRegister";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String resourceId;

    private List<MarketLocalizationRegisterInput> marketLocalizations;

    private String queryName;

    public MarketLocalizationsRegisterGraphQLQuery build() {
      return new MarketLocalizationsRegisterGraphQLQuery(resourceId, marketLocalizations, queryName, fieldsSet);
               
    }

    
    public Builder resourceId(String resourceId) {
      this.resourceId = resourceId;
      this.fieldsSet.add("resourceId");
      return this;
    }

    
    public Builder marketLocalizations(List<MarketLocalizationRegisterInput> marketLocalizations) {
      this.marketLocalizations = marketLocalizations;
      this.fieldsSet.add("marketLocalizations");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
