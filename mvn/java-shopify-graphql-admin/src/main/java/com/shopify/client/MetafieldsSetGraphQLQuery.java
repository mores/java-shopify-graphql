package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MetafieldsSetInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class MetafieldsSetGraphQLQuery extends GraphQLQuery {
  public MetafieldsSetGraphQLQuery(List<MetafieldsSetInput> metafields, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (metafields != null || fieldsSet.contains("metafields")) {
        getInput().put("metafields", metafields);
    }
  }

  public MetafieldsSetGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "metafieldsSet";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<MetafieldsSetInput> metafields;

    private String queryName;

    public MetafieldsSetGraphQLQuery build() {
      return new MetafieldsSetGraphQLQuery(metafields, queryName, fieldsSet);
               
    }

    
    public Builder metafields(List<MetafieldsSetInput> metafields) {
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
