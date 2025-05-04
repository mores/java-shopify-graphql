package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Return a mobile platform application by its ID.
 */
public class MobilePlatformApplicationGraphQLQuery extends GraphQLQuery {
  public MobilePlatformApplicationGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public MobilePlatformApplicationGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "mobilePlatformApplication";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public MobilePlatformApplicationGraphQLQuery build() {
      return new MobilePlatformApplicationGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * ID of the mobile platform app.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
