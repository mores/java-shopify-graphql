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
 * Installs storefront generation preview for shop.
 */
public class PreviewInstallGraphQLQuery extends GraphQLQuery {
  public PreviewInstallGraphQLQuery(String storefrontGenerationPreviewUuid, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (storefrontGenerationPreviewUuid != null || fieldsSet.contains("storefrontGenerationPreviewUuid")) {
        getInput().put("storefrontGenerationPreviewUuid", storefrontGenerationPreviewUuid);
    }
  }

  public PreviewInstallGraphQLQuery(String storefrontGenerationPreviewUuid, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (storefrontGenerationPreviewUuid != null || fieldsSet.contains("storefrontGenerationPreviewUuid")) {
        getInput().put("storefrontGenerationPreviewUuid", storefrontGenerationPreviewUuid);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public PreviewInstallGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "previewInstall";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String storefrontGenerationPreviewUuid;

    private String queryName;

    public PreviewInstallGraphQLQuery build() {
      return new PreviewInstallGraphQLQuery(storefrontGenerationPreviewUuid, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The UUID of the storefront_generation_preview to install.
     */
    public Builder storefrontGenerationPreviewUuid(String storefrontGenerationPreviewUuid) {
      this.storefrontGenerationPreviewUuid = storefrontGenerationPreviewUuid;
      this.fieldsSet.add("storefrontGenerationPreviewUuid");
      return this;
    }

    /**
     * The UUID of the storefront_generation_preview to install.
     */
    public Builder storefrontGenerationPreviewUuidReference(String variableRef) {
      this.variableReferences.put("storefrontGenerationPreviewUuid", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("storefrontGenerationPreviewUuid");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
