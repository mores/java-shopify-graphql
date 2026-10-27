package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.BackupRegionUpdateInput;
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
 * Update the backup region that is used when we have no better signal of what region a buyer is in.
 */
public class BackupRegionUpdateGraphQLQuery extends GraphQLQuery {
  public BackupRegionUpdateGraphQLQuery(BackupRegionUpdateInput region, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (region != null || fieldsSet.contains("region")) {
        getInput().put("region", region);
    }
  }

  public BackupRegionUpdateGraphQLQuery(BackupRegionUpdateInput region, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (region != null || fieldsSet.contains("region")) {
        getInput().put("region", region);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public BackupRegionUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "backupRegionUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private BackupRegionUpdateInput region;

    private String queryName;

    public BackupRegionUpdateGraphQLQuery build() {
      return new BackupRegionUpdateGraphQLQuery(region, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * Optional input representing the region to be updated. If not provided, the existing regions remain unchanged.
     */
    public Builder region(BackupRegionUpdateInput region) {
      this.region = region;
      this.fieldsSet.add("region");
      return this;
    }

    /**
     * Optional input representing the region to be updated. If not provided, the existing regions remain unchanged.
     */
    public Builder regionReference(String variableRef) {
      this.variableReferences.put("region", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("BackupRegionUpdateInput")).build());
      this.fieldsSet.add("region");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
