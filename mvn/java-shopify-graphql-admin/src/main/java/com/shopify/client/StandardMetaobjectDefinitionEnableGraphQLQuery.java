package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class StandardMetaobjectDefinitionEnableGraphQLQuery extends GraphQLQuery {
  public StandardMetaobjectDefinitionEnableGraphQLQuery(String type, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (type != null || fieldsSet.contains("type")) {
        getInput().put("type", type);
    }
  }

  public StandardMetaobjectDefinitionEnableGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "standardMetaobjectDefinitionEnable";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String type;

    private String queryName;

    public StandardMetaobjectDefinitionEnableGraphQLQuery build() {
      return new StandardMetaobjectDefinitionEnableGraphQLQuery(type, queryName, fieldsSet);
               
    }

    
    public Builder type(String type) {
      this.type = type;
      this.fieldsSet.add("type");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
