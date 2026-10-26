package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * A return policy profile.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ReturnPolicyProfile implements com.shopify.admin.types.Node {
  /**
   * Whether this return policy profile is the default profile for the shop.
   */
  private boolean _default;

  /**
   * The rules that apply to buyer-initiated edit and cancellation requests under
   * this policy. When null, edit rules are disabled and customers can request
   * cancellations without restrictions.
   */
  private ReturnPoliciesEditRules editRules;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The markets that this return policy profile applies to.
   */
  private List<Market> markets;

  /**
   * The name of the return policy profile. This is a merchant-defined value that
   * identifies the profile. The default profile has a null name.
   */
  private String name;

  /**
   * The rules that apply to returns under this policy. When null, return rules are
   * disabled and customers can return items without restrictions.
   */
  private ReturnPoliciesReturnRules returnRules;

  /**
   * The time when the return policy profile was last updated. This is an
   * aggregated value based on the profile, its default promise, and all overrides.
   */
  private OffsetDateTime updatedAt;

  public ReturnPolicyProfile() {
  }

  /**
   * Whether this return policy profile is the default profile for the shop.
   */
  public boolean getDefault() {
    return _default;
  }

  public void setDefault(boolean _default) {
    this._default = _default;
  }

  /**
   * The rules that apply to buyer-initiated edit and cancellation requests under
   * this policy. When null, edit rules are disabled and customers can request
   * cancellations without restrictions.
   */
  public ReturnPoliciesEditRules getEditRules() {
    return editRules;
  }

  public void setEditRules(ReturnPoliciesEditRules editRules) {
    this.editRules = editRules;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The markets that this return policy profile applies to.
   */
  public List<Market> getMarkets() {
    return markets;
  }

  public void setMarkets(List<Market> markets) {
    this.markets = markets;
  }

  /**
   * The name of the return policy profile. This is a merchant-defined value that
   * identifies the profile. The default profile has a null name.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The rules that apply to returns under this policy. When null, return rules are
   * disabled and customers can return items without restrictions.
   */
  public ReturnPoliciesReturnRules getReturnRules() {
    return returnRules;
  }

  public void setReturnRules(ReturnPoliciesReturnRules returnRules) {
    this.returnRules = returnRules;
  }

  /**
   * The time when the return policy profile was last updated. This is an
   * aggregated value based on the profile, its default promise, and all overrides.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "ReturnPolicyProfile{default='" + _default + "', editRules='" + editRules + "', id='" + id + "', markets='" + markets + "', name='" + name + "', returnRules='" + returnRules + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnPolicyProfile that = (ReturnPolicyProfile) o;
    return _default == that._default &&
        Objects.equals(editRules, that.editRules) &&
        Objects.equals(id, that.id) &&
        Objects.equals(markets, that.markets) &&
        Objects.equals(name, that.name) &&
        Objects.equals(returnRules, that.returnRules) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, editRules, id, markets, name, returnRules, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether this return policy profile is the default profile for the shop.
     */
    private boolean _default;

    /**
     * The rules that apply to buyer-initiated edit and cancellation requests under
     * this policy. When null, edit rules are disabled and customers can request
     * cancellations without restrictions.
     */
    private ReturnPoliciesEditRules editRules;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The markets that this return policy profile applies to.
     */
    private List<Market> markets;

    /**
     * The name of the return policy profile. This is a merchant-defined value that
     * identifies the profile. The default profile has a null name.
     */
    private String name;

    /**
     * The rules that apply to returns under this policy. When null, return rules are
     * disabled and customers can return items without restrictions.
     */
    private ReturnPoliciesReturnRules returnRules;

    /**
     * The time when the return policy profile was last updated. This is an
     * aggregated value based on the profile, its default promise, and all overrides.
     */
    private OffsetDateTime updatedAt;

    public ReturnPolicyProfile build() {
      ReturnPolicyProfile result = new ReturnPolicyProfile();
      result._default = this._default;
      result.editRules = this.editRules;
      result.id = this.id;
      result.markets = this.markets;
      result.name = this.name;
      result.returnRules = this.returnRules;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * Whether this return policy profile is the default profile for the shop.
     */
    public Builder _default(boolean _default) {
      this._default = _default;
      return this;
    }

    /**
     * The rules that apply to buyer-initiated edit and cancellation requests under
     * this policy. When null, edit rules are disabled and customers can request
     * cancellations without restrictions.
     */
    public Builder editRules(ReturnPoliciesEditRules editRules) {
      this.editRules = editRules;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The markets that this return policy profile applies to.
     */
    public Builder markets(List<Market> markets) {
      this.markets = markets;
      return this;
    }

    /**
     * The name of the return policy profile. This is a merchant-defined value that
     * identifies the profile. The default profile has a null name.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The rules that apply to returns under this policy. When null, return rules are
     * disabled and customers can return items without restrictions.
     */
    public Builder returnRules(ReturnPoliciesReturnRules returnRules) {
      this.returnRules = returnRules;
      return this;
    }

    /**
     * The time when the return policy profile was last updated. This is an
     * aggregated value based on the profile, its default promise, and all overrides.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
