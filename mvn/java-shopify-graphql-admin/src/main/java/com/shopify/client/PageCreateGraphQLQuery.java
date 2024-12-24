package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.PageCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class PageCreateGraphQLQuery extends GraphQLQuery {
  public PageCreateGraphQLQuery(PageCreateInput page, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (page != null || fieldsSet.contains("page")) {
        getInput().put("page", page);
    }
  }

  public PageCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "pageCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private PageCreateInput page;

    private String queryName;

    public PageCreateGraphQLQuery build() {
      return new PageCreateGraphQLQuery(page, queryName, fieldsSet);
               
    }

    
    public Builder page(PageCreateInput page) {
      this.page = page;
      this.fieldsSet.add("page");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
