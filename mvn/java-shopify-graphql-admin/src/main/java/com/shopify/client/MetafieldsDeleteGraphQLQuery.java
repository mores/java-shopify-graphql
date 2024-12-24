package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MetafieldIdentifierInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class MetafieldsDeleteGraphQLQuery extends GraphQLQuery {
  public MetafieldsDeleteGraphQLQuery(List<MetafieldIdentifierInput> metafields, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (metafields != null || fieldsSet.contains("metafields")) {
        getInput().put("metafields", metafields);
    }
  }

  public MetafieldsDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "metafieldsDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<MetafieldIdentifierInput> metafields;

    private String queryName;

    public MetafieldsDeleteGraphQLQuery build() {
      return new MetafieldsDeleteGraphQLQuery(metafields, queryName, fieldsSet);
               
    }

    
    public Builder metafields(List<MetafieldIdentifierInput> metafields) {
      this.metafields = metafields;
      this.fieldsSet.add("metafields");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
