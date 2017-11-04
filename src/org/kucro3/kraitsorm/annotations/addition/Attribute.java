package org.kucro3.kraitsorm.annotations.addition;

public enum Attribute {
    /**
     * <p>此属性用于确定数据类型的精度（或长度）</p>
     * 例如：
     * <dl>
     *     <dt>{@code @Addition(key = Attribute.PRECISION, values = "20")}可对应为：</dt>
     *     <dd>{@code varchar(20)}</dd>
     *     <dd>或 {@code nvarchar(20)}</dd>
     *     <dd>或 {@code decimal(20)}</dd>
     *     <dd>等</dd>
     * </dl>
     */
    PRECISION,

    /**
     * <p>此属性用于确定Decimal数据类型的小数精度</p>
     * <p>注意：使用此属性时必须存在{@link Attribute#PRECISION PRECISION}属性</p>
     * 例如：
     * <dl>
     *     <dt>
     *         {@code @Addition(key = Attribute.PRECISION, value = "20")}
     *         {@code @Addition(key = Attribute.SCALE, values = "2")}
     *         对应为：
     *     </dt>
     *     <dd>{@code decimal(20, 2)}</dd>
     * </dl>
     */
    SCALE,

    /**
     * <p>此属性表示字符在数据库中以双字节的形式存储</p>
     * <p>在一般情况下，此属性用于约束在数据库中对于数据类型的使用</p>
     * <p>不存在此属性时一般使用 {@code varchar}, {@code text} 等</p>
     * <p>而存在时将被约束为 {@code nvarchar}, {@code ntext} 等</p>
     */
    WORD_CHARACTER
}
