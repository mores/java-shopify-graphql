package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class MetafieldDefinitionUnpinGraphQLQuery extends GraphQLQuery {
  public MetafieldDefinitionUnpinGraphQLQuery(String definitionId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (definitionId != null || fieldsSet.contains("definitionId")) {
        getInput().put("definitionId", definitionId);
    }
  }

  public MetafieldDefinitionUnpinGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "metafieldDefinitionUnpin";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String definitionId;

    private String queryName;

    public MetafieldDefinitionUnpinGraphQLQuery build() {
      return new MetafieldDefinitionUnpinGraphQLQuery(definitionId, queryName, fieldsSet);
               
    }

    
    public Builder definitionId(String definitionId) {
      this.definitionId = definitionId;
      this.fieldsSet.add("definitionId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
