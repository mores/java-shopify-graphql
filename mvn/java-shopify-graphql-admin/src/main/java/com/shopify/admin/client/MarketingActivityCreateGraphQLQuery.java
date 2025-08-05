package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MarketingActivityCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Create new marketing activity. Marketing activity app extensions are deprecated and will be removed in the near future.
 */
public class MarketingActivityCreateGraphQLQuery extends GraphQLQuery {
  public MarketingActivityCreateGraphQLQuery(MarketingActivityCreateInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public MarketingActivityCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "marketingActivityCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private MarketingActivityCreateInput input;

    private String queryName;

    public MarketingActivityCreateGraphQLQuery build() {
      return new MarketingActivityCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The Input of marketing activity create.
     */
    public Builder input(MarketingActivityCreateInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
