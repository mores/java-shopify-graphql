package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MetaobjectDefinitionCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a new metaobject definition.
 */
public class MetaobjectDefinitionCreateGraphQLQuery extends GraphQLQuery {
  public MetaobjectDefinitionCreateGraphQLQuery(MetaobjectDefinitionCreateInput definition,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (definition != null || fieldsSet.contains("definition")) {
        getInput().put("definition", definition);
    }
  }

  public MetaobjectDefinitionCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "metaobjectDefinitionCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private MetaobjectDefinitionCreateInput definition;

    private String queryName;

    public MetaobjectDefinitionCreateGraphQLQuery build() {
      return new MetaobjectDefinitionCreateGraphQLQuery(definition, queryName, fieldsSet);
               
    }

    /**
     * The input fields for creating a metaobject definition.
     */
    public Builder definition(MetaobjectDefinitionCreateInput definition) {
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
