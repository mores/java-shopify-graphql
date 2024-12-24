package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class UrlRedirectBulkDeleteByIdsGraphQLQuery extends GraphQLQuery {
  public UrlRedirectBulkDeleteByIdsGraphQLQuery(List<String> ids, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (ids != null || fieldsSet.contains("ids")) {
        getInput().put("ids", ids);
    }
  }

  public UrlRedirectBulkDeleteByIdsGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "urlRedirectBulkDeleteByIds";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<String> ids;

    private String queryName;

    public UrlRedirectBulkDeleteByIdsGraphQLQuery build() {
      return new UrlRedirectBulkDeleteByIdsGraphQLQuery(ids, queryName, fieldsSet);
               
    }

    
    public Builder ids(List<String> ids) {
      this.ids = ids;
      this.fieldsSet.add("ids");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
