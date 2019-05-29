package com.github.saulocalixto.culty.cultyserver.servico.contrato;

import org.bson.types.ObjectId;

import java.util.List;

public interface IServicoPadrao<T> {
    /***
     * Consulta um objeto passando o id como elemento.
     * @param id id do objeto a ser consultado.
     * @return Objeto consultado no banco.
     */
    T consulte(ObjectId id);

    /***
     * Consulte todos os elementos salvos na coleção.
     * @return Lista com todos os elementos persistidos.
     */
    List<T> consulteTodos();

    /***
     * Salva no banco um objeto.
     * @param objeto Objeto a ser salvo.
     */
    T salve(T objeto);

    /***
     * Atualiza um objeto existente no banco.
     * @param objeto Objeto a ser atualizado.
     */
    void atualize(T objeto);

    /***
     * Remove do banco um objeto.
     * @param id Objeto a ser removido.
     */
    void exclua(ObjectId id);
}