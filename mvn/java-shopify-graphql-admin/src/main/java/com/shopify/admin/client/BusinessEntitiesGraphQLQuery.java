package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Returns the list of [business entities](https://shopify.dev/docs/api/admin-graphql/latest/objects/BusinessEntity)
 * associated with the shop. Use this query to retrieve business entities for
 * assigning to markets, managing payment providers per entity, or viewing entity
 * attribution on orders.
 *   
 * Each shop can have multiple business entities with one designated as primary.
 * To identify the primary entity in the query results, set the [`primary`](https://shopify.dev/docs/api/admin-graphql/latest/queries/businessEntities#returns-BusinessEntity.fields.primary)
 * field to `true`.
 *   
 * Learn more about [managing multiple legal entities](https://shopify.dev/docs/apps/build/markets/multiple-entities).
 */
public class BusinessEntitiesGraphQLQuery extends GraphQLQuery {
  public BusinessEntitiesGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public BusinessEntitiesGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "businessEntities";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String queryName;

    public BusinessEntitiesGraphQLQuery build() {
      return new BusinessEntitiesGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
