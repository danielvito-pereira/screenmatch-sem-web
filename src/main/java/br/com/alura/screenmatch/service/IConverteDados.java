package br.com.alura.screenmatch.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);//<T> T usado para criar sem o tipo, porem será necessario passar posteriormente com a Class por exemplo(o tipo precisa ser definido em algum momento)
}
