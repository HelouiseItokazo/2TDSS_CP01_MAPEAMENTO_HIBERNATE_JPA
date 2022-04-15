package br.com.fiap.main;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.CartaoCreditoDao;
import br.com.fiap.dao.CidadeDao;
import br.com.fiap.dao.CompraDao;
import br.com.fiap.dao.EnderecoDao;
import br.com.fiap.dao.EstabelecimentoDao;
import br.com.fiap.dao.TransacaoDao;
import br.com.fiap.dao.UsuarioDao;
import br.com.fiap.dao.impl.CartaoCreditoDaoImpl;
import br.com.fiap.dao.impl.CidadeDaoImpl;
import br.com.fiap.dao.impl.CompraDaoImpl;
import br.com.fiap.dao.impl.EnderecoDaoImpl;
import br.com.fiap.dao.impl.EstabelecimentoDaoImpl;
import br.com.fiap.dao.impl.TransacaoDaoImpl;
import br.com.fiap.dao.impl.UsuarioDaoImpl;
import br.com.fiap.entity.CartaoCredito;
import br.com.fiap.entity.Cidade;
import br.com.fiap.entity.Compra;
import br.com.fiap.entity.Endereco;
import br.com.fiap.entity.Estabelecimento;
import br.com.fiap.entity.Transacao;
import br.com.fiap.entity.Usuario;
import br.com.fiap.enumeration.BandeiraCartao;
import br.com.fiap.enumeration.SituacaoVisao;
import br.com.fiap.enumeration.StatusTransacao;
import br.com.fiap.enumeration.Uf;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class AtualizarTeste {

	public static void main(String[] args) {

		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();
		
		try {
			
			CartaoCredito cartaoCredito = new CartaoCredito(1111222233334444L, 1227, 123, BandeiraCartao.MASTERCARD);
			CartaoCreditoDao cartaoDao = new CartaoCreditoDaoImpl(em);
			cartaoDao.cadastrar(cartaoCredito);
			cartaoDao.commit();
			System.out.println(cartaoCredito.toString());
			cartaoCredito.setBandeira(BandeiraCartao.VISA);
			cartaoDao.atualizar(cartaoCredito);
			cartaoDao.commit();
			System.out.println(cartaoCredito.toString());
			
			
			Cidade cidade = new Cidade("São Paulo", Uf.SP);
			CidadeDao cidadeDao = new CidadeDaoImpl(em);
			cidadeDao.cadastrar(cidade);
			cidadeDao.commit();
			System.out.println(cidade.toString());
			cidade.setCidade("Campinas");
			cidadeDao.atualizar(cidade);
			cidadeDao.commit();
			System.out.println(cidade.toString());
			
			Compra compra = new Compra(new BigDecimal(100));
			CompraDao compraDao = new CompraDaoImpl(em);
			compraDao.cadastrar(compra);
			compraDao.commit();
			System.out.println(compra.toString());
			compra.setValor(new BigDecimal(200));
			compraDao.atualizar(compra);
			compraDao.commit();
			System.out.println(compra.toString());
			
			Endereco endereco = new Endereco("Rua Vilela, 1039", null, "Tatupé", 03314000);
			EnderecoDao enderecoDao = new EnderecoDaoImpl(em);
			enderecoDao.cadastrar(endereco);
			enderecoDao.commit();
			System.out.println(endereco.toString());
			endereco.setComplemento("Apto. 72");
			enderecoDao.atualizar(endereco);
			enderecoDao.commit();
			System.out.println(endereco.toString());
			
			Estabelecimento estabelecimento = new Estabelecimento("Real SST LTDA-ME", 30133111000111L);
			EstabelecimentoDao estabelecimentoDao = new EstabelecimentoDaoImpl(em);
			estabelecimentoDao.cadastrar(estabelecimento);
			estabelecimentoDao.commit();
			System.out.println(estabelecimento.toString());
			estabelecimento.setNome("FIAP LTDA");
			estabelecimentoDao.atualizar(estabelecimento);
			estabelecimentoDao.commit();
			System.out.println(estabelecimento.toString());
			
			Transacao transacao = new Transacao(LocalDate.now(), true, 2, new BigDecimal(50), StatusTransacao.AUTORIZADO, new BigDecimal(100));
			TransacaoDao transacaoDao = new TransacaoDaoImpl(em);
			transacaoDao.cadastrar(transacao);
			transacaoDao.commit();
			System.out.println(transacao.toString());
			transacao.setEhParcelado(false);
			transacao.setQuantidadeParcelas(null);
			transacao.setValorParcelas(null);
			transacaoDao.atualizar(transacao);
			transacaoDao.commit();
			System.out.println(transacao.toString());
			
			Usuario usuario = new Usuario(11122233345L, "Helouíse Itokazo", LocalDate.of(1993, 9, 9), SituacaoVisao.BAIXA_VISAO, "helo@gmail.com", "Helo", "123Senha", true, LocalDate.now());
			UsuarioDao usuarioDao = new UsuarioDaoImpl(em);
			usuarioDao.cadastrar(usuario);
			usuarioDao.commit();
			System.out.println(usuario.toString());
			usuario.setSenha("NovaSenha");
			usuario.setSituacaoVisao(SituacaoVisao.CEGUEIRA);
			usuarioDao.atualizar(usuario);
			usuarioDao.commit();
			System.out.println(usuario.toString());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}//catch
		
		em.close();
		fabrica.close();

	}

}
