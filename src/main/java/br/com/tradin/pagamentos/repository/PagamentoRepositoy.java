package br.com.tradin.pagamentos.repository;

import br.com.tradin.pagamentos.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepositoy extends JpaRepository<Pagamento, Long> {
}
