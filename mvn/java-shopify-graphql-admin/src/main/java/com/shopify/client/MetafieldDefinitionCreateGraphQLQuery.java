package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MetafieldDefinitionInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class MetafieldDefinitionCreateGraphQLQuery extends GraphQLQuery {
  public MetafieldDefinitionCreateGraphQLQuery(MetafieldDefinitionInput definition,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (definition != null || fieldsSet.contains("definition")) {
        getInput().put("definition", definition);
    }
  }

  public MetafieldDefinitionCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "metafieldDefinitionCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private MetafieldDefinitionInput definition;

    private String queryName;

    public MetafieldDefinitionCreateGraphQLQuery build() {
      return new MetafieldDefinitionCreateGraphQLQuery(definition, queryName, fieldsSet);
               
    }

    
    public Builder definition(MetafieldDefinitionInput definition) {
      this.definition = definition;
      this.fieldsSet.add("definition");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
