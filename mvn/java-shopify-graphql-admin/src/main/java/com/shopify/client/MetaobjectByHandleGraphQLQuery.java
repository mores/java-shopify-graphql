package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MetaobjectHandleInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class MetaobjectByHandleGraphQLQuery extends GraphQLQuery {
  public MetaobjectByHandleGraphQLQuery(MetaobjectHandleInput handle, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
    }
  }

  public MetaobjectByHandleGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "metaobjectByHandle";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private MetaobjectHandleInput handle;

    private String queryName;

    public MetaobjectByHandleGraphQLQuery build() {
      return new MetaobjectByHandleGraphQLQuery(handle, queryName, fieldsSet);
               
    }

    
    public Builder handle(MetaobjectHandleInput handle) {
      this.handle = handle;
      this.fieldsSet.add("handle");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
