package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MenuItemUpdateInput;
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
 * Updates a [`Menu`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Menu) for
 * display on the storefront. Modifies the menu's title and navigation structure,
 * including nested [`MenuItem`](https://shopify.dev/docs/api/admin-graphql/latest/objects/MenuItem)
 * objects. You can update the handle for non-default menus.
 *   
 * The items argument accepts a list of menu items with their nested structure.
 * Each item can include nested items to create multi-level navigation
 * hierarchies. Default menus have restricted updates—you can't change their handles.
 */
public class MenuUpdateGraphQLQuery extends GraphQLQuery {
  public MenuUpdateGraphQLQuery(String id, String title, String handle,
      List<MenuItemUpdateInput> items, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (title != null || fieldsSet.contains("title")) {
        getInput().put("title", title);
    }if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
    }if (items != null || fieldsSet.contains("items")) {
        getInput().put("items", items);
    }
  }

  public MenuUpdateGraphQLQuery(String id, String title, String handle,
      List<MenuItemUpdateInput> items, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (title != null || fieldsSet.contains("title")) {
        getInput().put("title", title);
    }if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
    }if (items != null || fieldsSet.contains("items")) {
        getInput().put("items", items);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public MenuUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "menuUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private String title;

    private String handle;

    private List<MenuItemUpdateInput> items;

    private String queryName;

    public MenuUpdateGraphQLQuery build() {
      return new MenuUpdateGraphQLQuery(id, title, handle, items, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * ID of the menu to be updated.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * ID of the menu to be updated.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The menu's title.
     */
    public Builder title(String title) {
      this.title = title;
      this.fieldsSet.add("title");
      return this;
    }

    /**
     * The menu's title.
     */
    public Builder titleReference(String variableRef) {
      this.variableReferences.put("title", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("title");
      return this;
    }

    /**
     * The menu's handle.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      this.fieldsSet.add("handle");
      return this;
    }

    /**
     * The menu's handle.
     */
    public Builder handleReference(String variableRef) {
      this.variableReferences.put("handle", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("String")).build());
      this.fieldsSet.add("handle");
      return this;
    }

    /**
     * List of the menu's items.
     */
    public Builder items(List<MenuItemUpdateInput> items) {
      this.items = items;
      this.fieldsSet.add("items");
      return this;
    }

    /**
     * List of the menu's items.
     */
    public Builder itemsReference(String variableRef) {
      this.variableReferences.put("items", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("MenuItemUpdateInput"))))).build());
      this.fieldsSet.add("items");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
