package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class TaxonomyCategory implements com.shopify.types.Node {
  
  private List<String> ancestorIds;

  
  private TaxonomyCategoryAttributeConnection attributes;

  
  private List<String> childrenIds;

  
  private String fullName;

  
  private String id;

  
  private boolean isArchived;

  
  private boolean isLeaf;

  
  private boolean isRoot;

  
  private int level;

  
  private String name;

  
  private String parentId;

  public TaxonomyCategory() {
  }

  
  public List<String> getAncestorIds() {
    return ancestorIds;
  }

  public void setAncestorIds(List<String> ancestorIds) {
    this.ancestorIds = ancestorIds;
  }

  
  public TaxonomyCategoryAttributeConnection getAttributes() {
    return attributes;
  }

  public void setAttributes(TaxonomyCategoryAttributeConnection attributes) {
    this.attributes = attributes;
  }

  
  public List<String> getChildrenIds() {
    return childrenIds;
  }

  public void setChildrenIds(List<String> childrenIds) {
    this.childrenIds = childrenIds;
  }

  
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public boolean getIsArchived() {
    return isArchived;
  }

  public void setIsArchived(boolean isArchived) {
    this.isArchived = isArchived;
  }

  
  public boolean getIsLeaf() {
    return isLeaf;
  }

  public void setIsLeaf(boolean isLeaf) {
    this.isLeaf = isLeaf;
  }

  
  public boolean getIsRoot() {
    return isRoot;
  }

  public void setIsRoot(boolean isRoot) {
    this.isRoot = isRoot;
  }

  
  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  @Override
  public String toString() {
    return "TaxonomyCategory{ancestorIds='" + ancestorIds + "', attributes='" + attributes + "', childrenIds='" + childrenIds + "', fullName='" + fullName + "', id='" + id + "', isArchived='" + isArchived + "', isLeaf='" + isLeaf + "', isRoot='" + isRoot + "', level='" + level + "', name='" + name + "', parentId='" + parentId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TaxonomyCategory that = (TaxonomyCategory) o;
    return Objects.equals(ancestorIds, that.ancestorIds) &&
        Objects.equals(attributes, that.attributes) &&
        Objects.equals(childrenIds, that.childrenIds) &&
        Objects.equals(fullName, that.fullName) &&
        Objects.equals(id, that.id) &&
        isArchived == that.isArchived &&
        isLeaf == that.isLeaf &&
        isRoot == that.isRoot &&
        level == that.level &&
        Objects.equals(name, that.name) &&
        Objects.equals(parentId, that.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ancestorIds, attributes, childrenIds, fullName, id, isArchived, isLeaf, isRoot, level, name, parentId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<String> ancestorIds;

    
    private TaxonomyCategoryAttributeConnection attributes;

    
    private List<String> childrenIds;

    
    private String fullName;

    
    private String id;

    
    private boolean isArchived;

    
    private boolean isLeaf;

    
    private boolean isRoot;

    
    private int level;

    
    private String name;

    
    private String parentId;

    public TaxonomyCategory build() {
      TaxonomyCategory result = new TaxonomyCategory();
      result.ancestorIds = this.ancestorIds;
      result.attributes = this.attributes;
      result.childrenIds = this.childrenIds;
      result.fullName = this.fullName;
      result.id = this.id;
      result.isArchived = this.isArchived;
      result.isLeaf = this.isLeaf;
      result.isRoot = this.isRoot;
      result.level = this.level;
      result.name = this.name;
      result.parentId = this.parentId;
      return result;
    }

    
    public Builder ancestorIds(List<String> ancestorIds) {
      this.ancestorIds = ancestorIds;
      return this;
    }

    
    public Builder attributes(TaxonomyCategoryAttributeConnection attributes) {
      this.attributes = attributes;
      return this;
    }

    
    public Builder childrenIds(List<String> childrenIds) {
      this.childrenIds = childrenIds;
      return this;
    }

    
    public Builder fullName(String fullName) {
      this.fullName = fullName;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder isArchived(boolean isArchived) {
      this.isArchived = isArchived;
      return this;
    }

    
    public Builder isLeaf(boolean isLeaf) {
      this.isLeaf = isLeaf;
      return this;
    }

    
    public Builder isRoot(boolean isRoot) {
      this.isRoot = isRoot;
      return this;
    }

    
    public Builder level(int level) {
      this.level = level;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder parentId(String parentId) {
      this.parentId = parentId;
      return this;
    }
  }
}
