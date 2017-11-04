package org.kucro3.kraitsorm.annotations.addition;

public enum Attribute {
    /**
     * <p>����������ȷ���������͵ľ��ȣ��򳤶ȣ�</p>
     * ���磺
     * <dl>
     *     <dt>{@code @Addition(key = Attribute.PRECISION, values = "20")}�ɶ�ӦΪ��</dt>
     *     <dd>{@code varchar(20)}</dd>
     *     <dd>�� {@code nvarchar(20)}</dd>
     *     <dd>�� {@code decimal(20)}</dd>
     *     <dd>��</dd>
     * </dl>
     */
    PRECISION,

    /**
     * <p>����������ȷ��Decimal�������͵�С������</p>
     * <p>ע�⣺ʹ�ô�����ʱ�������{@link Attribute#PRECISION PRECISION}����</p>
     * ���磺
     * <dl>
     *     <dt>
     *         {@code @Addition(key = Attribute.PRECISION, value = "20")}
     *         {@code @Addition(key = Attribute.SCALE, values = "2")}
     *         ��ӦΪ��
     *     </dt>
     *     <dd>{@code decimal(20, 2)}</dd>
     * </dl>
     */
    SCALE,

    /**
     * <p>�����Ա�ʾ�ַ������ݿ�����˫�ֽڵ���ʽ�洢</p>
     * <p>��һ������£�����������Լ�������ݿ��ж����������͵�ʹ��</p>
     * <p>�����ڴ�����ʱһ��ʹ�� {@code varchar}, {@code text} ��</p>
     * <p>������ʱ����Լ��Ϊ {@code nvarchar}, {@code ntext} ��</p>
     */
    WORD_CHARACTER
}
