package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Runs the full product sync for a given shop.
 */
public class ProductFullSyncGraphQLQuery extends GraphQLQuery {
  public ProductFullSyncGraphQLQuery(OffsetDateTime beforeUpdatedAt, String id,
      OffsetDateTime updatedAtSince, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (beforeUpdatedAt != null || fieldsSet.contains("beforeUpdatedAt")) {
        getInput().put("beforeUpdatedAt", beforeUpdatedAt);
    }if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (updatedAtSince != null || fieldsSet.contains("updatedAtSince")) {
        getInput().put("updatedAtSince", updatedAtSince);
    }
  }

  public ProductFullSyncGraphQLQuery(OffsetDateTime beforeUpdatedAt, String id,
      OffsetDateTime updatedAtSince, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (beforeUpdatedAt != null || fieldsSet.contains("beforeUpdatedAt")) {
        getInput().put("beforeUpdatedAt", beforeUpdatedAt);
    }if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (updatedAtSince != null || fieldsSet.contains("updatedAtSince")) {
        getInput().put("updatedAtSince", updatedAtSince);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public ProductFullSyncGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productFullSync";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private OffsetDateTime beforeUpdatedAt;

    private String id;

    private OffsetDateTime updatedAtSince;

    private String queryName;

    public ProductFullSyncGraphQLQuery build() {
      return new ProductFullSyncGraphQLQuery(beforeUpdatedAt, id, updatedAtSince, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * Syncs only products that haven't changed since the specified timestamp.
     */
    public Builder beforeUpdatedAt(OffsetDateTime beforeUpdatedAt) {
      this.beforeUpdatedAt = beforeUpdatedAt;
      this.fieldsSet.add("beforeUpdatedAt");
      return this;
    }

    /**
     * Syncs only products that haven't changed since the specified timestamp.
     */
    public Builder beforeUpdatedAtReference(String variableRef) {
      this.variableReferences.put("beforeUpdatedAt", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("DateTime")).build());
      this.fieldsSet.add("beforeUpdatedAt");
      return this;
    }

    /**
     * The product feed which needs syncing.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The product feed which needs syncing.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * Syncs only products that have changed since the specified timestamp.
     */
    public Builder updatedAtSince(OffsetDateTime updatedAtSince) {
      this.updatedAtSince = updatedAtSince;
      this.fieldsSet.add("updatedAtSince");
      return this;
    }

    /**
     * Syncs only products that have changed since the specified timestamp.
     */
    public Builder updatedAtSinceReference(String variableRef) {
      this.variableReferences.put("updatedAtSince", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("DateTime")).build());
      this.fieldsSet.add("updatedAtSince");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
