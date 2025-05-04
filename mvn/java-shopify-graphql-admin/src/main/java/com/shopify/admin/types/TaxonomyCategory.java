package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The details of a specific product category within the [Shopify product taxonomy](https://shopify.github.io/product-taxonomy/releases/unstable/?categoryId=sg-4-17-2-17).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class TaxonomyCategory implements com.shopify.admin.types.Node {
  /**
   * The IDs of the category's ancestor categories.
   */
  private List<String> ancestorIds;

  /**
   * The attributes of the taxonomy category.
   */
  private TaxonomyCategoryAttributeConnection attributes;

  /**
   * The IDs of the category's child categories.
   */
  private List<String> childrenIds;

  /**
   * The full name of the taxonomy category. For example, Animals &amp; Pet Supplies > Pet Supplies > Dog Supplies > Dog Beds.
   */
  private String fullName;

  /**
   * The globally-unique ID of the TaxonomyCategory.
   */
  private String id;

  /**
   * Whether the category is archived. The default value is `false`.
   */
  private boolean isArchived;

  /**
   * Whether the category is a leaf category. A leaf category doesn't have any
   * subcategories beneath it. For example, in Animals &amp; Pet Supplies > Pet
   * Supplies > Dog Supplies > Dog Treadmills, Dog Treadmills is a leaf category.
   * The value is `true` when there are no `childrenIds` specified.
   */
  private boolean isLeaf;

  /**
   * Whether the category is a root category. A root category is at the top level
   * of the category hierarchy and doesn't have a parent category. For example,
   * Animals &amp; Pet Supplies. The value is `true` when there's no `parentId` specified.
   */
  private boolean isRoot;

  /**
   * The level of the category in the taxonomy tree. Levels indicate the depth of
   * the category from the root. For example, in Animals &amp; Pet Supplies > Pet
   * Supplies > Dog Supplies, Animals &amp; Pet Supplies is at level 1, Animals &amp; Pet
   * Supplies > Pet Supplies is at level 2, and Animals &amp; Pet Supplies > Pet
   * Supplies > Dog Supplies is at level 3.
   */
  private int level;

  /**
   * The name of the taxonomy category. For example, Dog Beds.
   */
  private String name;

  /**
   * The ID of the category's parent category.
   */
  private String parentId;

  public TaxonomyCategory() {
  }

  /**
   * The IDs of the category's ancestor categories.
   */
  public List<String> getAncestorIds() {
    return ancestorIds;
  }

  public void setAncestorIds(List<String> ancestorIds) {
    this.ancestorIds = ancestorIds;
  }

  /**
   * The attributes of the taxonomy category.
   */
  public TaxonomyCategoryAttributeConnection getAttributes() {
    return attributes;
  }

  public void setAttributes(TaxonomyCategoryAttributeConnection attributes) {
    this.attributes = attributes;
  }

  /**
   * The IDs of the category's child categories.
   */
  public List<String> getChildrenIds() {
    return childrenIds;
  }

  public void setChildrenIds(List<String> childrenIds) {
    this.childrenIds = childrenIds;
  }

  /**
   * The full name of the taxonomy category. For example, Animals &amp; Pet Supplies > Pet Supplies > Dog Supplies > Dog Beds.
   */
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  /**
   * The globally-unique ID of the TaxonomyCategory.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Whether the category is archived. The default value is `false`.
   */
  public boolean getIsArchived() {
    return isArchived;
  }

  public void setIsArchived(boolean isArchived) {
    this.isArchived = isArchived;
  }

  /**
   * Whether the category is a leaf category. A leaf category doesn't have any
   * subcategories beneath it. For example, in Animals &amp; Pet Supplies > Pet
   * Supplies > Dog Supplies > Dog Treadmills, Dog Treadmills is a leaf category.
   * The value is `true` when there are no `childrenIds` specified.
   */
  public boolean getIsLeaf() {
    return isLeaf;
  }

  public void setIsLeaf(boolean isLeaf) {
    this.isLeaf = isLeaf;
  }

  /**
   * Whether the category is a root category. A root category is at the top level
   * of the category hierarchy and doesn't have a parent category. For example,
   * Animals &amp; Pet Supplies. The value is `true` when there's no `parentId` specified.
   */
  public boolean getIsRoot() {
    return isRoot;
  }

  public void setIsRoot(boolean isRoot) {
    this.isRoot = isRoot;
  }

  /**
   * The level of the category in the taxonomy tree. Levels indicate the depth of
   * the category from the root. For example, in Animals &amp; Pet Supplies > Pet
   * Supplies > Dog Supplies, Animals &amp; Pet Supplies is at level 1, Animals &amp; Pet
   * Supplies > Pet Supplies is at level 2, and Animals &amp; Pet Supplies > Pet
   * Supplies > Dog Supplies is at level 3.
   */
  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  /**
   * The name of the taxonomy category. For example, Dog Beds.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The ID of the category's parent category.
   */
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
    /**
     * The IDs of the category's ancestor categories.
     */
    private List<String> ancestorIds;

    /**
     * The attributes of the taxonomy category.
     */
    private TaxonomyCategoryAttributeConnection attributes;

    /**
     * The IDs of the category's child categories.
     */
    private List<String> childrenIds;

    /**
     * The full name of the taxonomy category. For example, Animals &amp; Pet Supplies > Pet Supplies > Dog Supplies > Dog Beds.
     */
    private String fullName;

    /**
     * The globally-unique ID of the TaxonomyCategory.
     */
    private String id;

    /**
     * Whether the category is archived. The default value is `false`.
     */
    private boolean isArchived;

    /**
     * Whether the category is a leaf category. A leaf category doesn't have any
     * subcategories beneath it. For example, in Animals &amp; Pet Supplies > Pet
     * Supplies > Dog Supplies > Dog Treadmills, Dog Treadmills is a leaf category.
     * The value is `true` when there are no `childrenIds` specified.
     */
    private boolean isLeaf;

    /**
     * Whether the category is a root category. A root category is at the top level
     * of the category hierarchy and doesn't have a parent category. For example,
     * Animals &amp; Pet Supplies. The value is `true` when there's no `parentId` specified.
     */
    private boolean isRoot;

    /**
     * The level of the category in the taxonomy tree. Levels indicate the depth of
     * the category from the root. For example, in Animals &amp; Pet Supplies > Pet
     * Supplies > Dog Supplies, Animals &amp; Pet Supplies is at level 1, Animals &amp; Pet
     * Supplies > Pet Supplies is at level 2, and Animals &amp; Pet Supplies > Pet
     * Supplies > Dog Supplies is at level 3.
     */
    private int level;

    /**
     * The name of the taxonomy category. For example, Dog Beds.
     */
    private String name;

    /**
     * The ID of the category's parent category.
     */
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

    /**
     * The IDs of the category's ancestor categories.
     */
    public Builder ancestorIds(List<String> ancestorIds) {
      this.ancestorIds = ancestorIds;
      return this;
    }

    /**
     * The attributes of the taxonomy category.
     */
    public Builder attributes(TaxonomyCategoryAttributeConnection attributes) {
      this.attributes = attributes;
      return this;
    }

    /**
     * The IDs of the category's child categories.
     */
    public Builder childrenIds(List<String> childrenIds) {
      this.childrenIds = childrenIds;
      return this;
    }

    /**
     * The full name of the taxonomy category. For example, Animals &amp; Pet Supplies > Pet Supplies > Dog Supplies > Dog Beds.
     */
    public Builder fullName(String fullName) {
      this.fullName = fullName;
      return this;
    }

    /**
     * The globally-unique ID of the TaxonomyCategory.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Whether the category is archived. The default value is `false`.
     */
    public Builder isArchived(boolean isArchived) {
      this.isArchived = isArchived;
      return this;
    }

    /**
     * Whether the category is a leaf category. A leaf category doesn't have any
     * subcategories beneath it. For example, in Animals &amp; Pet Supplies > Pet
     * Supplies > Dog Supplies > Dog Treadmills, Dog Treadmills is a leaf category.
     * The value is `true` when there are no `childrenIds` specified.
     */
    public Builder isLeaf(boolean isLeaf) {
      this.isLeaf = isLeaf;
      return this;
    }

    /**
     * Whether the category is a root category. A root category is at the top level
     * of the category hierarchy and doesn't have a parent category. For example,
     * Animals &amp; Pet Supplies. The value is `true` when there's no `parentId` specified.
     */
    public Builder isRoot(boolean isRoot) {
      this.isRoot = isRoot;
      return this;
    }

    /**
     * The level of the category in the taxonomy tree. Levels indicate the depth of
     * the category from the root. For example, in Animals &amp; Pet Supplies > Pet
     * Supplies > Dog Supplies, Animals &amp; Pet Supplies is at level 1, Animals &amp; Pet
     * Supplies > Pet Supplies is at level 2, and Animals &amp; Pet Supplies > Pet
     * Supplies > Dog Supplies is at level 3.
     */
    public Builder level(int level) {
      this.level = level;
      return this;
    }

    /**
     * The name of the taxonomy category. For example, Dog Beds.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The ID of the category's parent category.
     */
    public Builder parentId(String parentId) {
      this.parentId = parentId;
      return this;
    }
  }
}
