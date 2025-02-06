package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MetaobjectDefinitionUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a metaobject definition with new settings and metafield definitions.
 */
public class MetaobjectDefinitionUpdateGraphQLQuery extends GraphQLQuery {
  public MetaobjectDefinitionUpdateGraphQLQuery(String id,
      MetaobjectDefinitionUpdateInput definition, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (definition != null || fieldsSet.contains("definition")) {
        getInput().put("definition", definition);
    }
  }

  public MetaobjectDefinitionUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "metaobjectDefinitionUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private MetaobjectDefinitionUpdateInput definition;

    private String queryName;

    public MetaobjectDefinitionUpdateGraphQLQuery build() {
      return new MetaobjectDefinitionUpdateGraphQLQuery(id, definition, queryName, fieldsSet);
               
    }

    /**
     * The ID of the metaobject definition to update.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The input fields for updating a metaobject definition.
     */
    public Builder definition(MetaobjectDefinitionUpdateInput definition) {
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
