import org.json.JSONObject;
import org.json.XML;

public class XmtToJson {

    public static void main(String[] args) {
       String xml = " <despachos>\n" +
               "      <despacho codigo=\"IPAS024\" nome=\"Indeferimento do pedido\">\n" +
               "        <texto-complementar>A marca é constituida por sinal ou expressão de propaganda, irregistrável de acordo com o inciso VII do Art 124 da LPI. Art. 124 - Não são registráveis como marca: VII - sinal ou expressão empregada apenas como meio de propaganda;</texto-complementar>\n" +
               "      </despacho>\n" +
               "    </despachos>";

        JSONObject json = XML.toJSONObject(xml);

        System.out.println(json);
    }

}
