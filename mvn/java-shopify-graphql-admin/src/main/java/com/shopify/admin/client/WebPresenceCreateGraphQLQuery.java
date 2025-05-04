package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.WebPresenceCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a web presence.
 */
public class WebPresenceCreateGraphQLQuery extends GraphQLQuery {
  public WebPresenceCreateGraphQLQuery(WebPresenceCreateInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public WebPresenceCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "webPresenceCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private WebPresenceCreateInput input;

    private String queryName;

    public WebPresenceCreateGraphQLQuery build() {
      return new WebPresenceCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The details of the web presence to be created.
     */
    public Builder input(WebPresenceCreateInput input) {
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
