package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.PageUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class PageUpdateGraphQLQuery extends GraphQLQuery {
  public PageUpdateGraphQLQuery(String id, PageUpdateInput page, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (page != null || fieldsSet.contains("page")) {
        getInput().put("page", page);
    }
  }

  public PageUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "pageUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private PageUpdateInput page;

    private String queryName;

    public PageUpdateGraphQLQuery build() {
      return new PageUpdateGraphQLQuery(id, page, queryName, fieldsSet);
               
    }

    
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    
    public Builder page(PageUpdateInput page) {
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
