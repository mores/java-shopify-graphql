package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MobilePlatformApplicationCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Create a mobile platform application.
 */
public class MobilePlatformApplicationCreateGraphQLQuery extends GraphQLQuery {
  public MobilePlatformApplicationCreateGraphQLQuery(MobilePlatformApplicationCreateInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public MobilePlatformApplicationCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "mobilePlatformApplicationCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private MobilePlatformApplicationCreateInput input;

    private String queryName;

    public MobilePlatformApplicationCreateGraphQLQuery build() {
      return new MobilePlatformApplicationCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The input to create a mobile platform application.
     */
    public Builder input(MobilePlatformApplicationCreateInput input) {
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
