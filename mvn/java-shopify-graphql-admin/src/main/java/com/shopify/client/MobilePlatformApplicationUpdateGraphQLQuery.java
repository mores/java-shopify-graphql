package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MobilePlatformApplicationUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Update a mobile platform application.
 */
public class MobilePlatformApplicationUpdateGraphQLQuery extends GraphQLQuery {
  public MobilePlatformApplicationUpdateGraphQLQuery(String id,
      MobilePlatformApplicationUpdateInput input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public MobilePlatformApplicationUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "mobilePlatformApplicationUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private MobilePlatformApplicationUpdateInput input;

    private String queryName;

    public MobilePlatformApplicationUpdateGraphQLQuery build() {
      return new MobilePlatformApplicationUpdateGraphQLQuery(id, input, queryName, fieldsSet);
               
    }

    /**
     * The ID of the Mobile Platform Application to be updated.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The input to updat a Mobile Platform Application.
     */
    public Builder input(MobilePlatformApplicationUpdateInput input) {
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
