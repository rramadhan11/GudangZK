
package id.go.customs.mpn.client.cukai;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Cukai", targetNamespace = "http://bean.cukai.billing.customs.go.id/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Cukai {


    /**
     * 
     * @param jnsDok
     * @param kdKantor
     * @param tglAwal
     * @param tglAkhir
     * @return
     *     returns java.util.List<id.go.customs.mpn.client.cukai.TdDokMaster>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTagihanCukaiByTgl", targetNamespace = "http://bean.cukai.billing.customs.go.id/", className = "id.go.customs.mpn.client.cukai.GetTagihanCukaiByTgl")
    @ResponseWrapper(localName = "getTagihanCukaiByTglResponse", targetNamespace = "http://bean.cukai.billing.customs.go.id/", className = "id.go.customs.mpn.client.cukai.GetTagihanCukaiByTglResponse")
    @Action(input = "http://bean.cukai.billing.customs.go.id/Cukai/getTagihanCukaiByTglRequest", output = "http://bean.cukai.billing.customs.go.id/Cukai/getTagihanCukaiByTglResponse")
    public List<TdDokMaster> getTagihanCukaiByTgl(
        @WebParam(name = "kdKantor", targetNamespace = "")
        String kdKantor,
        @WebParam(name = "jnsDok", targetNamespace = "")
        String jnsDok,
        @WebParam(name = "tglAwal", targetNamespace = "")
        String tglAwal,
        @WebParam(name = "tglAkhir", targetNamespace = "")
        String tglAkhir);

    /**
     * 
     * @param jnsDok
     * @param noDok
     * @param kdKantor
     * @param tglDok
     * @return
     *     returns id.go.customs.mpn.client.cukai.TdDokMaster
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTagihanCukaiByNomor", targetNamespace = "http://bean.cukai.billing.customs.go.id/", className = "id.go.customs.mpn.client.cukai.GetTagihanCukaiByNomor")
    @ResponseWrapper(localName = "getTagihanCukaiByNomorResponse", targetNamespace = "http://bean.cukai.billing.customs.go.id/", className = "id.go.customs.mpn.client.cukai.GetTagihanCukaiByNomorResponse")
    @Action(input = "http://bean.cukai.billing.customs.go.id/Cukai/getTagihanCukaiByNomorRequest", output = "http://bean.cukai.billing.customs.go.id/Cukai/getTagihanCukaiByNomorResponse")
    public TdDokMaster getTagihanCukaiByNomor(
        @WebParam(name = "kdKantor", targetNamespace = "")
        String kdKantor,
        @WebParam(name = "jnsDok", targetNamespace = "")
        String jnsDok,
        @WebParam(name = "noDok", targetNamespace = "")
        String noDok,
        @WebParam(name = "tglDok", targetNamespace = "")
        String tglDok);

    /**
     * 
     * @param listTdBillingDetail
     * @param tdBillingMaster
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRekonTagihanCukai", targetNamespace = "http://bean.cukai.billing.customs.go.id/", className = "id.go.customs.mpn.client.cukai.GetRekonTagihanCukai")
    @ResponseWrapper(localName = "getRekonTagihanCukaiResponse", targetNamespace = "http://bean.cukai.billing.customs.go.id/", className = "id.go.customs.mpn.client.cukai.GetRekonTagihanCukaiResponse")
    @Action(input = "http://bean.cukai.billing.customs.go.id/Cukai/getRekonTagihanCukaiRequest", output = "http://bean.cukai.billing.customs.go.id/Cukai/getRekonTagihanCukaiResponse")
    public boolean getRekonTagihanCukai(
        @WebParam(name = "tdBillingMaster", targetNamespace = "")
        TdBillingMaster tdBillingMaster,
        @WebParam(name = "listTdBillingDetail", targetNamespace = "")
        List<TdBillingDetail> listTdBillingDetail);

    /**
     * 
     * @param tdDokMaster
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "setBillingPiutangCukai", targetNamespace = "http://bean.cukai.billing.customs.go.id/", className = "id.go.customs.mpn.client.cukai.SetBillingPiutangCukai")
    @ResponseWrapper(localName = "setBillingPiutangCukaiResponse", targetNamespace = "http://bean.cukai.billing.customs.go.id/", className = "id.go.customs.mpn.client.cukai.SetBillingPiutangCukaiResponse")
    @Action(input = "http://bean.cukai.billing.customs.go.id/Cukai/setBillingPiutangCukaiRequest", output = "http://bean.cukai.billing.customs.go.id/Cukai/setBillingPiutangCukaiResponse")
    public boolean setBillingPiutangCukai(
        @WebParam(name = "tdDokMaster", targetNamespace = "")
        TdDokMaster tdDokMaster);

    /**
     * 
     * @param kdAkun
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getKodePungutan", targetNamespace = "http://bean.cukai.billing.customs.go.id/", className = "id.go.customs.mpn.client.cukai.GetKodePungutan")
    @ResponseWrapper(localName = "getKodePungutanResponse", targetNamespace = "http://bean.cukai.billing.customs.go.id/", className = "id.go.customs.mpn.client.cukai.GetKodePungutanResponse")
    @Action(input = "http://bean.cukai.billing.customs.go.id/Cukai/getKodePungutanRequest", output = "http://bean.cukai.billing.customs.go.id/Cukai/getKodePungutanResponse")
    public String getKodePungutan(
        @WebParam(name = "kdAkun", targetNamespace = "")
        String kdAkun);

}
