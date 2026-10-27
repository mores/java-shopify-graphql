package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ThemeFilesCopyFileInput;
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
 * Copy theme files. Copying to existing theme files will overwrite them.
 */
public class ThemeFilesCopyGraphQLQuery extends GraphQLQuery {
  public ThemeFilesCopyGraphQLQuery(String themeId, List<ThemeFilesCopyFileInput> files,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (themeId != null || fieldsSet.contains("themeId")) {
        getInput().put("themeId", themeId);
    }if (files != null || fieldsSet.contains("files")) {
        getInput().put("files", files);
    }
  }

  public ThemeFilesCopyGraphQLQuery(String themeId, List<ThemeFilesCopyFileInput> files,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (themeId != null || fieldsSet.contains("themeId")) {
        getInput().put("themeId", themeId);
    }if (files != null || fieldsSet.contains("files")) {
        getInput().put("files", files);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public ThemeFilesCopyGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "themeFilesCopy";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String themeId;

    private List<ThemeFilesCopyFileInput> files;

    private String queryName;

    public ThemeFilesCopyGraphQLQuery build() {
      return new ThemeFilesCopyGraphQLQuery(themeId, files, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The theme to update.
     */
    public Builder themeId(String themeId) {
      this.themeId = themeId;
      this.fieldsSet.add("themeId");
      return this;
    }

    /**
     * The theme to update.
     */
    public Builder themeIdReference(String variableRef) {
      this.variableReferences.put("themeId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("themeId");
      return this;
    }

    /**
     * The files to update.
     */
    public Builder files(List<ThemeFilesCopyFileInput> files) {
      this.files = files;
      this.fieldsSet.add("files");
      return this;
    }

    /**
     * The files to update.
     */
    public Builder filesReference(String variableRef) {
      this.variableReferences.put("files", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ThemeFilesCopyFileInput"))))).build());
      this.fieldsSet.add("files");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
