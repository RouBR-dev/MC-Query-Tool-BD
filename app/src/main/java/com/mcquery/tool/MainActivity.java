package com.mcquery.tool;

import android.animation.*;
import android.app.*;
import android.app.AlertDialog;
import android.content.*;
import android.content.DialogInterface;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class MainActivity extends AppCompatActivity {
	
	private LinearLayout linear1;
	private LinearLayout linear15;
	private LinearLayout linear5;
	private LinearLayout linear4;
	private LinearLayout linear6;
	private LinearLayout linear2;
	private TextView textview1;
	private LinearLayout linear3;
	private LinearLayout linear9;
	private LinearLayout linear14;
	private LinearLayout linear16;
	private LinearLayout linear18;
	private LinearLayout linear17;
	private LinearLayout linear20;
	private Button button3;
	private LinearLayout linear19;
	private Button button4;
	private Button button2;
	private TextView textview3;
	private LinearLayout linear7;
	private EditText edittext1;
	private TextView textview2;
	private LinearLayout linear8;
	private EditText edittext2;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private Button button1;
	
	private RequestNetwork net;
	private RequestNetwork.RequestListener _net_request_listener;
	private AlertDialog.Builder dialog;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear15 = findViewById(R.id.linear15);
		linear5 = findViewById(R.id.linear5);
		linear4 = findViewById(R.id.linear4);
		linear6 = findViewById(R.id.linear6);
		linear2 = findViewById(R.id.linear2);
		textview1 = findViewById(R.id.textview1);
		linear3 = findViewById(R.id.linear3);
		linear9 = findViewById(R.id.linear9);
		linear14 = findViewById(R.id.linear14);
		linear16 = findViewById(R.id.linear16);
		linear18 = findViewById(R.id.linear18);
		linear17 = findViewById(R.id.linear17);
		linear20 = findViewById(R.id.linear20);
		button3 = findViewById(R.id.button3);
		linear19 = findViewById(R.id.linear19);
		button4 = findViewById(R.id.button4);
		button2 = findViewById(R.id.button2);
		textview3 = findViewById(R.id.textview3);
		linear7 = findViewById(R.id.linear7);
		edittext1 = findViewById(R.id.edittext1);
		textview2 = findViewById(R.id.textview2);
		linear8 = findViewById(R.id.linear8);
		edittext2 = findViewById(R.id.edittext2);
		linear11 = findViewById(R.id.linear11);
		linear12 = findViewById(R.id.linear12);
		linear13 = findViewById(R.id.linear13);
		button1 = findViewById(R.id.button1);
		net = new RequestNetwork(this);
		dialog = new AlertDialog.Builder(this);
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		_net_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
	}
	
	private void initializeLogic() {
		// ===== FUNDO =====
		linear1.setBackgroundColor(Color.parseColor("#121212"));
		linear1.setPadding(32, 32, 32, 32);
		
		// ===== FUNÇÃO DE EFEITO DE CLIQUE =====
		View.OnTouchListener efeitoClique = new View.OnTouchListener() {
			    @Override
			    public boolean onTouch(View v, MotionEvent event) {
				        switch (event.getAction()) {
					            case MotionEvent.ACTION_DOWN:
					                v.animate().scaleX(0.96f).scaleY(0.96f).setDuration(100).start();
					                break;
					            case MotionEvent.ACTION_UP:
					            case MotionEvent.ACTION_CANCEL:
					                v.animate().scaleX(1f).scaleY(1f).setDuration(100).start();
					                break;
					        }
				        return false;
				    }
		};
		
		// ===== TEXTVIEW 3 (IP) =====
		textview3.setText("IP:");
		textview3.setTextColor(Color.parseColor("#E0E0E0"));
		textview3.setTextSize(16);
		textview3.setPadding(32, 16, 32, 16);
		textview3.setLineSpacing(1.2f, 1.2f);
		
		GradientDrawable txtBg3 = new GradientDrawable();
		txtBg3.setColor(Color.parseColor("#1C1C1C"));
		txtBg3.setCornerRadius(24);
		txtBg3.setStroke(2, Color.parseColor("#2E7D32"));
		textview3.setBackground(txtBg3);
		
		// ===== EDITTEXT 1 (IP) =====
		edittext1.setTextColor(Color.WHITE);
		edittext1.setTextSize(15);
		edittext1.setPadding(32, 24, 32, 24);
		edittext1.setGravity(Gravity.START | Gravity.CENTER_VERTICAL); // cursor normal à esquerda
		
		GradientDrawable edtBg1 = new GradientDrawable();
		edtBg1.setColor(Color.parseColor("#1E1E1E"));
		edtBg1.setCornerRadius(24);
		edtBg1.setStroke(2, Color.parseColor("#2E7D32"));
		edittext1.setBackground(edtBg1);
		edittext1.setOnTouchListener(efeitoClique);
		
		// ===== TEXTVIEW 2 (Porta) =====
		textview2.setText("Porta:");
		textview2.setTextColor(Color.parseColor("#E0E0E0"));
		textview2.setTextSize(16);
		textview2.setPadding(32, 16, 32, 16);
		textview2.setLineSpacing(1.2f, 1.2f);
		
		GradientDrawable txtBg2 = new GradientDrawable();
		txtBg2.setColor(Color.parseColor("#1C1C1C"));
		txtBg2.setCornerRadius(24);
		txtBg2.setStroke(2, Color.parseColor("#2E7D32"));
		textview2.setBackground(txtBg2);
		
		// ===== EDITTEXT 2 (PORTA) =====
		edittext2.setTextColor(Color.WHITE);
		edittext2.setTextSize(15);
		edittext2.setPadding(32, 24, 32, 24);
		edittext2.setGravity(Gravity.START | Gravity.CENTER_VERTICAL);
		
		GradientDrawable edtBg2 = new GradientDrawable();
		edtBg2.setColor(Color.parseColor("#1E1E1E"));
		edtBg2.setCornerRadius(24);
		edtBg2.setStroke(2, Color.parseColor("#2E7D32"));
		edittext2.setBackground(edtBg2);
		edittext2.setOnTouchListener(efeitoClique);
		
		// Teclado numérico para porta
		edittext2.setInputType(InputType.TYPE_CLASS_NUMBER);
		
		// ===== BOTÃO =====
		button1.setText("CONSULTAR SERVIDOR");
		button1.setTextColor(Color.WHITE);
		button1.setTextSize(15);
		button1.setAllCaps(false);
		button1.setPadding(32, 24, 32, 24);
		
		GradientDrawable btnBg = new GradientDrawable();
		btnBg.setColor(Color.parseColor("#2E7D32"));
		btnBg.setCornerRadius(24);
		button1.setBackground(btnBg);
		
		// Ripple apenas no botão
		TypedValue outValue = new TypedValue();
		getTheme().resolveAttribute(android.R.attr.selectableItemBackground, outValue, true);
		button1.setForeground(getDrawable(outValue.resourceId));
		button1.setOnTouchListener(efeitoClique);
		
		// ===== TEXTVIEW PRINCIPAL =====
		textview1.setText("Aguardando consulta...");
		textview1.setTextColor(Color.parseColor("#E0E0E0"));
		textview1.setTextSize(16);
		textview1.setPadding(32, 32, 32, 32);
		textview1.setLineSpacing(1.2f, 1.2f);
		
		GradientDrawable txtBg = new GradientDrawable();
		txtBg.setColor(Color.parseColor("#1C1C1C"));
		txtBg.setCornerRadius(24);
		txtBg.setStroke(2, Color.parseColor("#333333"));
		textview1.setBackground(txtBg);
		// Views
		edittext1 = findViewById(R.id.edittext1);
		edittext2 = findViewById(R.id.edittext2);
		textview1 = findViewById(R.id.textview1);
		button1 = findViewById(R.id.button1);
		
		// SharedPreferences
		final SharedPreferences prefs = getSharedPreferences("MC_PREFS", MODE_PRIVATE);
		
		// Carregar últimos valores salvos
		edittext1.setText(prefs.getString("ultimo_ip", ""));
		edittext2.setText(prefs.getString("ultima_porta", ""));
		
		// Carregar texto salvo ou exibir mensagem inicial
		String textoSalvo = prefs.getString("ultimo_texto_html", "");
		if (textoSalvo.isEmpty()) {
			    textview1.setText("⏳ Aguardando a primeira consulta...");
		} else {
			    textview1.setText(Html.fromHtml(textoSalvo, Html.FROM_HTML_MODE_LEGACY));
		}
		
		// Button1 - sempre consulta do zero
		button1.setOnClickListener(new View.OnClickListener() {
			    @Override
			    public void onClick(View v) {
				        textview1.setText("");
				
				        String ipInputTemp = edittext1.getText().toString().trim();
				        String portaTemp = edittext2.getText().toString().trim();
				
				        if (ipInputTemp.isEmpty()) {
					            textview1.setText("Digite o IP do servidor!");
					            prefs.edit().putString(
					                    "ultimo_texto_html",
					                    "<font color='#F44336'>Digite o IP do servidor!</font>"
					            ).apply();
					            return;
					        }
				
				        if (portaTemp.isEmpty()) {
					            textview1.setText("Digite a porta!");
					            prefs.edit().putString(
					                    "ultimo_texto_html",
					                    "<font color='#F44336'>Digite a porta!</font>"
					            ).apply();
					            return;
					        }
				
				        // ===== VERIFICA INTERNET =====
				        ConnectivityManager cm =
				                (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
				        NetworkInfo netInfo = cm != null ? cm.getActiveNetworkInfo() : null;
				
				        if (netInfo == null || !netInfo.isConnected()) {
					            textview1.setText("❌ Problema de internet ou sem conexão");
					            return;
					        }
				        // =============================
				
				        prefs.edit()
				                .putString("ultimo_ip", ipInputTemp)
				                .putString("ultima_porta", portaTemp)
				                .apply();
				
				        ipInputTemp = ipInputTemp.replace("https://", "").replace("http://", "");
				        final String ipCompleto = ipInputTemp + ":" + portaTemp;
				
				        // Mostra, mas NÃO salva
				        textview1.setText("Consultando servidor Bedrock...");
				
				        final RequestNetwork net = new RequestNetwork(MainActivity.this);
				
				        new Handler().postDelayed(new Runnable() {
					            @Override
					            public void run() {
						                String url = "https://api.mcsrvstat.us/bedrock/2/" + ipCompleto;
						
						                net.startRequestNetwork(
						                        RequestNetworkController.GET,
						                        url,
						                        "mc",
						                        new RequestNetwork.RequestListener() {
							
							                            @Override
							                            public void onResponse(
							                                    String tag,
							                                    String response,
							                                    HashMap<String, Object> headers) {
								
								                                try {
									                                    JSONObject json = new JSONObject(response);
									                                    boolean online = json.optBoolean("online", false);
									
									                                    String horaConsulta =
									                                            "\n\n🕒 Última consulta: " +
									                                            new SimpleDateFormat(
									                                                    "dd/MM/yyyy HH:mm:ss",
									                                                    Locale.getDefault()
									                                            ).format(new Date());
									
									                                    if (!online) {
										                                        String offTexto =
										                                                "<font color='#F44336'>🔴 STATUS: OFFLINE</font><br><br>" +
										                                                "<font color='#FFC107'>🌐 IP: " + ipCompleto + "</font><br>" +
										                                                horaConsulta;
										
										                                        textview1.setText(
										                                                Html.fromHtml(
										                                                        offTexto,
										                                                        Html.FROM_HTML_MODE_LEGACY
										                                                )
										                                        );
										                                        prefs.edit()
										                                                .putString("ultimo_texto_html", offTexto)
										                                                .apply();
										                                        return;
										                                    }
									
									                                    JSONObject players = json.optJSONObject("players");
									                                    int onlinePlayers =
									                                            players != null ? players.optInt("online", 0) : 0;
									                                    int maxPlayers =
									                                            players != null ? players.optInt("max", 0) : 0;
									
									                                    String version = json.optString("version", "N/A");
									
									                                    int ping = -1;
									                                    JSONObject debug = json.optJSONObject("debug");
									                                    if (debug != null) {
										                                        ping = debug.optInt("ping", -1);
										                                    }
									
									                                    // ===== MOTD =====
									                                    String motdTexto = "N/A";
									                                    JSONObject motd = json.optJSONObject("motd");
									                                    if (motd != null) {
										                                        JSONArray clean = motd.optJSONArray("clean");
										                                        if (clean != null && clean.length() > 0) {
											                                            motdTexto = clean.getString(0);
											                                        }
										                                    }
									                                    // =================
									
									                                    // ===== GAMEMODE =====
									                                    String gamemode = json.optString("gamemode", "Desconhecido");
									                                    // ====================
									
									                                    // ===== PROTOCOLO =====
									                                    int protocol = json.optInt("protocol", -1);
									                                    // =====================
									
									                                    StringBuilder html = new StringBuilder();
									                                    html.append("<font color='#4CAF50'>🟢 STATUS: ONLINE</font><br><br>");
									                                    html.append("<font color='#2196F3'>🎮 TIPO: BEDROCK</font><br>");
									                                    html.append("<font color='#FFC107'>🌐 IP: ")
									                                            .append(ipCompleto)
									                                            .append("</font><br>");
									                                    html.append("<font color='#9C27B0'>🧩 VERSÃO: ")
									                                            .append(version)
									                                            .append("</font><br>");
									                                    html.append("<font color='#FF9800'>👥 JOGADORES: ")
									                                            .append(onlinePlayers)
									                                            .append("/")
									                                            .append(maxPlayers)
									                                            .append("</font><br>");
									
									                                    if (ping != -1) {
										                                        html.append("<font color='#00BCD4'>⏱ PING: ")
										                                                .append(ping)
										                                                .append("ms</font><br>");
										                                    }
									
									                                    // MOTD
									                                    html.append("<font color='#E91E63'>📜 MOTD: ")
									                                            .append(motdTexto)
									                                            .append("</font><br>");
									
									                                    // GAMEMODE
									                                    html.append("<font color='#009688'>🕹 MODO DE JOGO: ")
									                                            .append(gamemode)
									                                            .append("</font><br>");
									
									                                    // PROTOCOLO
									                                    if (protocol != -1) {
										                                        html.append("<font color='#795548'>📡 PROTOCOLO: ")
										                                                .append(protocol)
										                                                .append("</font><br>");
										                                    }
									
									                                    html.append(horaConsulta);
									
									                                    textview1.setText(
									                                            Html.fromHtml(
									                                                    html.toString(),
									                                                    Html.FROM_HTML_MODE_LEGACY
									                                            )
									                                    );
									
									                                    prefs.edit()
									                                            .putString("ultimo_texto_html", html.toString())
									                                            .apply();
									
									                                } catch (Exception e) {
									                                    textview1.setText("Erro ao processar dados");
									                                }
								                            }
							
							                            @Override
							                            public void onErrorResponse(String tag, String message) {
								                                textview1.setText("Erro de conexão");
								                            }
							                        }
						                );
						            }
					        }, 2000);
				    }
		});
		
		// Button2 - Compartilhar resultado da consulta
		button2 = findViewById(R.id.button2);
		
		button2.setClickable(true);
		button2.setFocusable(true);
		
		// Animação de clique + compartilhamento funcionando juntos
		button2.setOnTouchListener(new View.OnTouchListener() {
			    @Override
			    public boolean onTouch(View v, MotionEvent event) {
				
				        if (event.getAction() == MotionEvent.ACTION_DOWN) {
					            v.animate()
					                    .scaleX(0.88f)
					                    .scaleY(0.88f)
					                    .setDuration(200)
					                    .start();
					        }
				
				        if (event.getAction() == MotionEvent.ACTION_UP
				                || event.getAction() == MotionEvent.ACTION_CANCEL) {
					
					            v.animate()
					                    .scaleX(1f)
					                    .scaleY(1f)
					                    .setDuration(220)
					                    .start();
					
					            // Dispara o clique normalmente
					            v.performClick();
					        }
				
				        return true;
				    }
		});
		
		// Lógica original do botão (compartilhar)
		button2.setOnClickListener(new View.OnClickListener() {
			    @Override
			    public void onClick(View v) {
				
				        String textoParaCompartilhar = textview1.getText().toString().trim();
				
				        if (textoParaCompartilhar.isEmpty()
				                || textoParaCompartilhar.equals("⏳ Aguardando a primeira consulta...")) {
					            Toast.makeText(
					                    MainActivity.this,
					                    "Nenhuma consulta para compartilhar",
					                    Toast.LENGTH_SHORT
					            ).show();
					            return;
					        }
				
				        Intent intent = new Intent(Intent.ACTION_SEND);
				        intent.setType("text/plain");
				        intent.putExtra(Intent.EXTRA_TEXT, textoParaCompartilhar);
				        intent.putExtra(Intent.EXTRA_SUBJECT, "Consulta servidor Minecraft");
				
				        startActivity(
				                Intent.createChooser(intent, "Compartilhar resultado")
				        );
				    }
		});
		// ===== BUTTON 2 PEQUENO (30x30dp) =====
		button2.setText("");
		button2.setAllCaps(false);
		button2.setPadding(0, 0, 0, 0);
		button2.setGravity(Gravity.CENTER);
		
		// Fundo igual ao TextView3
		GradientDrawable btnBg2 = new GradientDrawable();
		btnBg2.setColor(Color.parseColor("#1C1C1C"));
		btnBg2.setCornerRadius(24);
		btnBg2.setStroke(2, Color.parseColor("#2E7D32"));
		
		// Tamanho do botão 30dp x 30dp
		int sizeDp = 30;
		int sizePx = (int) (sizeDp * getResources().getDisplayMetrics().density);
		LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(sizePx, sizePx);
		params.setMargins(0, 16, 0, 0);
		button2.setLayoutParams(params);
		
		// Ícone menor que o botão (70%) e centralizado
		Drawable icon = getResources().getDrawable(R.drawable.ic_share_white);
		int iconSize = (int)(sizePx * 0.7); // 70% do botão
		icon.setBounds(0, 0, iconSize, iconSize);
		InsetDrawable insetIcon = new InsetDrawable(icon, (sizePx - iconSize)/2, (sizePx - iconSize)/2, (sizePx - iconSize)/2, (sizePx - iconSize)/2);
		
		// Aplicar o ícone centralizado como background usando LayerDrawable
		LayerDrawable layer = new LayerDrawable(new Drawable[]{btnBg2, insetIcon});
		button2.setBackground(layer);
		
		// Efeito de clique
		button2.setOnTouchListener(efeitoClique);
		// ===== Button3 - Mostrar histórico colorido invertido =====
		button3 = findViewById(R.id.button3);
		button3.setOnClickListener(new View.OnClickListener() {
			    @Override
			    public void onClick(View v) {
				
				        String historicoSalvo = prefs.getString("historico_consultas_lista", "");
				        ArrayList<String> historicoLista = new ArrayList<>();
				
				        if (!historicoSalvo.isEmpty()) {
					            String[] items = historicoSalvo.split("&&&");
					            for (String item : items) {
						                if (!item.trim().isEmpty()) {
							                    historicoLista.add(item);
							                }
						            }
					        }
				
				        if (historicoLista.isEmpty()) {
					            Toast.makeText(MainActivity.this, "Consulta ainda não realizada!", Toast.LENGTH_SHORT).show();
					            return;
					        }
				
				        Collections.reverse(historicoLista);
				
				        StringBuilder historicoExibir = new StringBuilder();
				        int i = historicoLista.size();
				        for (String item : historicoLista) {
					            historicoExibir.append("<hr style='border:1px solid #CCCCCC;'>");
					            historicoExibir.append("<font color='#FF9800'><b>Consulta ").append(i).append("</b></font><br>");
					            historicoExibir.append(item).append("<br>");
					            i--;
					        }
				
				        new AlertDialog.Builder(MainActivity.this)
				                .setTitle("Histórico de Consultas")
				                .setMessage(Html.fromHtml(historicoExibir.toString()))
				                .setPositiveButton("Fechar", null)
				                .show();
				    }
		});
		
		
		// ===== Salvar automaticamente após a consulta (CORRIGIDO) =====
		CharSequence cs = textview1.getText();
		if (cs != null && cs.length() > 0) {
			
			    String htmlAtual;
			    if (cs instanceof Spanned) {
				        htmlAtual = Html.toHtml((Spanned) cs);
				    } else {
				        htmlAtual = Html.escapeHtml(cs.toString());
				    }
			
			    if (htmlAtual.contains("STATUS: ONLINE") || htmlAtual.contains("STATUS: OFFLINE")) {
				
				        String historicoSalvo = prefs.getString("historico_consultas_lista", "");
				        ArrayList<String> historicoLista = new ArrayList<>();
				
				        if (!historicoSalvo.isEmpty()) {
					            String[] items = historicoSalvo.split("&&&");
					            for (String item : items) {
						                if (!item.trim().isEmpty()) {
							                    historicoLista.add(item);
							                }
						            }
					        }
				
				        if (historicoLista.isEmpty() || 
				            !historicoLista.get(historicoLista.size() - 1).equals(htmlAtual)) {
					
					            historicoLista.add(htmlAtual);
					
					            StringBuilder sb = new StringBuilder();
					            for (String item : historicoLista) {
						                sb.append(item).append("&&&");
						            }
					
					            prefs.edit()
					                 .putString("historico_consultas_lista", sb.toString())
					                 .apply();
					        }
				    }
		}
		// ===== BUTTON 3 PEQUENO (30x30dp) =====
		button3 = findViewById(R.id.button3);
		button3.setText("");
		button3.setAllCaps(false);
		button3.setPadding(0, 0, 0, 0);
		button3.setGravity(Gravity.CENTER);
		
		// Fundo igual ao TextView3
		GradientDrawable btnBg3 = new GradientDrawable();
		btnBg3.setColor(Color.parseColor("#1C1C1C"));
		btnBg3.setCornerRadius(24);
		btnBg3.setStroke(2, Color.parseColor("#2E7D32"));
		
		// Tamanho do botão 30dp x 30dp
		int sizeDp3 = 30;
		int sizePx3 = (int) (sizeDp3 * getResources().getDisplayMetrics().density);
		LinearLayout.LayoutParams params3 = new LinearLayout.LayoutParams(sizePx3, sizePx3);
		params3.setMargins(0, 16, 0, 0); // mesmo espaçamento do button2
		button3.setLayoutParams(params3);
		
		// Ícone menor que o botão (70%) e centralizado
		Drawable icon3 = getResources().getDrawable(R.drawable.ic_insert_chart_white);
		int iconSize3 = (int)(sizePx3 * 0.7); // 70% do botão
		icon3.setBounds(0, 0, iconSize3, iconSize3);
		InsetDrawable insetIcon3 = new InsetDrawable(icon3, (sizePx3 - iconSize3)/2, (sizePx3 - iconSize3)/2, (sizePx3 - iconSize3)/2, (sizePx3 - iconSize3)/2);
		
		// Aplicar o ícone centralizado como background usando LayerDrawable
		LayerDrawable layer3 = new LayerDrawable(new Drawable[]{btnBg3, insetIcon3});
		button3.setBackground(layer3);
		
		// Efeito de clique
		button3.setOnTouchListener(efeitoClique);
		textview1.addTextChangedListener(new TextWatcher() {
			
			    @Override
			    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
				        // não usado
				    }
			
			    @Override
			    public void onTextChanged(CharSequence s, int start, int before, int count) {
				        // não usado
				    }
			
			    @Override
			    public void afterTextChanged(Editable s) {
				
				        if (s.toString().trim().isEmpty()) return;
				
				        // Converte mantendo HTML/cores
				        String htmlAtual = Html.toHtml((Spanned) textview1.getText());
				
				        // Recupera histórico salvo
				        String historicoSalvo = prefs.getString("historico_consultas_lista", "");
				        ArrayList<String> historicoLista = new ArrayList<>();
				
				        if (!historicoSalvo.isEmpty()) {
					            String[] items = historicoSalvo.split("&&&");
					            for (String item : items) {
						                if (!item.trim().isEmpty()) {
							                    historicoLista.add(item);
							                }
						            }
					        }
				
				        // Evita salvar repetido
				        if (historicoLista.size() > 0) {
					            String ultimo = historicoLista.get(historicoLista.size() - 1);
					            if (ultimo.equals(htmlAtual)) return;
					        }
				
				        // Adiciona novo histórico
				        historicoLista.add(htmlAtual);
				
				        // Salva novamente
				        StringBuilder sb = new StringBuilder();
				        for (String item : historicoLista) {
					            sb.append(item).append("&&&");
					        }
				
				        prefs.edit()
				             .putString("historico_consultas_lista", sb.toString())
				             .apply();
				    }
		});
		// ===== BUTTON1 - Consultar, salvar histórico e últimos valores =====
		button1.setOnClickListener(new View.OnClickListener() {
			    @Override
			    public void onClick(View v) {
				        textview1.setText("");
				
				        String ipInputTemp = edittext1.getText().toString().trim();
				        String portaTemp = edittext2.getText().toString().trim();
				
				        if (ipInputTemp.isEmpty()) {
					            textview1.setText("Digite o IP do servidor!");
					            prefs.edit().putString("ultimo_texto_html",
					                    "<font color='#F44336'>Digite o IP do servidor!</font>").apply();
					            return;
					        }
				
				        // Se porta estiver vazia, colocar porta padrão Bedrock
				        if (portaTemp.isEmpty()) {
					            portaTemp = "19132";
					        }
				
				        // ===== VERIFICA INTERNET =====
				        ConnectivityManager cm =
				                (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
				        NetworkInfo netInfo = cm != null ? cm.getActiveNetworkInfo() : null;
				        if (netInfo == null || !netInfo.isConnected()) {
					            textview1.setText("❌ Problema de internet ou sem conexão");
					            return;
					        }
				
				        // ===== REMOVER http:// ou https:// PARA SALVAR E CONSULTAR =====
				        String ipLimpo = ipInputTemp.replaceFirst("https?://", "");
				
				        // ===== SALVAR ÚLTIMO IP E PORTA =====
				        prefs.edit()
				                .putString("ultimo_ip", ipLimpo)
				                .putString("ultima_porta", portaTemp)
				                .apply();
				
				        // ===== SALVAR HISTÓRICO DE IP E PORTA =====
				        String ipPortaAtual = ipLimpo + ":" + portaTemp;
				        String ipPortaSalvos = prefs.getString("historico_ip_porta", "");
				        ArrayList<String> listaIPPorta = new ArrayList<>();
				
				        if (!ipPortaSalvos.isEmpty()) {
					            String[] items = ipPortaSalvos.split("&&&");
					            for (String item : items) if (!item.trim().isEmpty()) listaIPPorta.add(item);
					        }
				
				        if (listaIPPorta.isEmpty() || !listaIPPorta.get(listaIPPorta.size() - 1).equals(ipPortaAtual)) {
					            listaIPPorta.add(ipPortaAtual);
					            StringBuilder sb = new StringBuilder();
					            for (String item : listaIPPorta) sb.append(item).append("&&&");
					            prefs.edit().putString("historico_ip_porta", sb.toString()).apply();
					        }
				
				        final String ipCompleto = ipLimpo + ":" + portaTemp;
				        textview1.setText("Consultando servidor Bedrock...");
				
				        final RequestNetwork net = new RequestNetwork(MainActivity.this);
				
				        new Handler().postDelayed(new Runnable() {
					            @Override
					            public void run() {
						                String url = "https://api.mcsrvstat.us/bedrock/2/" + ipCompleto;
						
						                net.startRequestNetwork(RequestNetworkController.GET, url, "mc",
						                        new RequestNetwork.RequestListener() {
							                            @Override
							                            public void onResponse(String tag, String response, HashMap<String, Object> headers) {
								                                try {
									                                    JSONObject json = new JSONObject(response);
									                                    boolean online = json.optBoolean("online", false);
									                                    String horaConsulta = "\n\n🕒 Última consulta: " +
									                                            new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.getDefault()).format(new Date());
									
									                                    if (!online) {
										                                        String offTexto = "<font color='#F44336'>🔴 STATUS: OFFLINE</font><br><br>" +
										                                                "<font color='#FFC107'>🌐 IP: " + ipCompleto + "</font><br>" +
										                                                horaConsulta;
										                                        textview1.setText(Html.fromHtml(offTexto, Html.FROM_HTML_MODE_LEGACY));
										                                        prefs.edit().putString("ultimo_texto_html", offTexto).apply();
										                                        return;
										                                    }
									
									                                    JSONObject players = json.optJSONObject("players");
									                                    int onlinePlayers = players != null ? players.optInt("online", 0) : 0;
									                                    int maxPlayers = players != null ? players.optInt("max", 0) : 0;
									                                    String version = json.optString("version", "N/A");
									                                    int ping = -1;
									                                    JSONObject debug = json.optJSONObject("debug");
									                                    if (debug != null) ping = debug.optInt("ping", -1);
									                                    String motdTexto = "N/A";
									                                    JSONObject motd = json.optJSONObject("motd");
									                                    if (motd != null) {
										                                        JSONArray clean = motd.optJSONArray("clean");
										                                        if (clean != null && clean.length() > 0) motdTexto = clean.getString(0);
										                                    }
									                                    String gamemode = json.optString("gamemode", "Desconhecido");
									                                    int protocol = json.optInt("protocol", -1);
									
									                                    StringBuilder html = new StringBuilder();
									                                    html.append("<font color='#4CAF50'>🟢 STATUS: ONLINE</font><br><br>");
									                                    html.append("<font color='#2196F3'>🎮 TIPO: BEDROCK</font><br>");
									                                    html.append("<font color='#FFC107'>🌐 IP: ").append(ipCompleto).append("</font><br>");
									                                    html.append("<font color='#9C27B0'>🧩 VERSÃO: ").append(version).append("</font><br>");
									                                    html.append("<font color='#FF9800'>👥 JOGADORES: ").append(onlinePlayers).append("/").append(maxPlayers).append("</font><br>");
									                                    if (ping != -1) html.append("<font color='#00BCD4'>⏱ PING: ").append(ping).append("ms</font><br>");
									                                    html.append("<font color='#E91E63'>📜 MOTD: ").append(motdTexto).append("</font><br>");
									                                    html.append("<font color='#009688'>🕹 MODO DE JOGO: ").append(gamemode).append("</font><br>");
									                                    if (protocol != -1) html.append("<font color='#795548'>📡 PROTOCOLO: ").append(protocol).append("</font><br>");
									                                    html.append(horaConsulta);
									
									                                    textview1.setText(Html.fromHtml(html.toString(), Html.FROM_HTML_MODE_LEGACY));
									                                    prefs.edit().putString("ultimo_texto_html", html.toString()).apply();
									                                } catch (Exception e) {
									                                    textview1.setText("Erro ao processar dados");
									                                }
								                            }
							
							                            @Override
							                            public void onErrorResponse(String tag, String message) {
								                                textview1.setText("Erro de conexão");
								                            }
							                        });
						            }
					        }, 2000);
				    }
		});
		
		// ===== BUTTON4 - Mostrar histórico clicável e preencher EditTexts corretamente =====
		button4.setOnClickListener(new View.OnClickListener() {
			    @Override
			    public void onClick(View v) {
				        String ipPortaSalvos = prefs.getString("historico_ip_porta", "");
				        final ArrayList<String> listaIPPorta = new ArrayList<>();
				
				        if (!ipPortaSalvos.isEmpty()) {
					            String[] items = ipPortaSalvos.split("&&&");
					            for (String item : items) if (!item.trim().isEmpty()) listaIPPorta.add(item);
					        }
				
				        if (listaIPPorta.isEmpty()) {
					            Toast.makeText(MainActivity.this, "Nenhum IP ou porta salvo!", Toast.LENGTH_SHORT).show();
					            return;
					        }
				
				        final ArrayList<String> listaParaExibir = new ArrayList<>();
				        for (int i = listaIPPorta.size() - 1; i >= 0; i--) listaParaExibir.add(listaIPPorta.get(i));
				
				        final ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this,
				                android.R.layout.simple_list_item_1, listaParaExibir);
				
				        new AlertDialog.Builder(MainActivity.this)
				                .setTitle("Histórico de IPs e Portas")
				                .setAdapter(adapter, new DialogInterface.OnClickListener() {
					                    @Override
					                    public void onClick(DialogInterface dialog, int which) {
						                        String selecionado = adapter.getItem(which);
						                        if (selecionado != null) {
							                            // ⚡ Separar IP e porta, mesmo que IP tenha https:// removido
							                            String[] partes = selecionado.split(Pattern.quote(":"));
							                            if (partes.length == 2) {
								                                edittext1.setText(partes[0]); // IP limpo
								                                edittext2.setText(partes[1]); // Porta
								                            }
							                        }
						                    }
					                })
				                .setPositiveButton("Fechar", null)
				                .show();
				    }
		});
		// ===== BUTTON 4 PEQUENO (30x30dp) =====
		button4 = findViewById(R.id.button4);
		button4.setText("");
		button4.setAllCaps(false);
		button4.setPadding(0, 0, 0, 0);
		button4.setGravity(Gravity.CENTER);
		
		// Fundo igual ao TextView3
		GradientDrawable btnBg4 = new GradientDrawable();
		btnBg4.setColor(Color.parseColor("#1C1C1C"));
		btnBg4.setCornerRadius(24);
		btnBg4.setStroke(2, Color.parseColor("#2E7D32"));
		
		// Tamanho do botão 30dp x 30dp
		int sizeDp4 = 30;
		int sizePx4 = (int) (sizeDp4 * getResources().getDisplayMetrics().density);
		LinearLayout.LayoutParams params4 = new LinearLayout.LayoutParams(sizePx4, sizePx4);
		params4.setMargins(0, 16, 0, 0); // mesmo espaçamento do button2
		button4.setLayoutParams(params4);
		
		// Ícone menor que o botão (70%) e centralizado
		Drawable icon4 = getResources().getDrawable(R.drawable.ic_assignment_white);
		int iconSize4 = (int)(sizePx4 * 0.7); // 70% do botão
		icon4.setBounds(0, 0, iconSize4, iconSize4);
		InsetDrawable insetIcon4 = new InsetDrawable(icon4, (sizePx4 - iconSize4)/2, (sizePx4 - iconSize4)/2, (sizePx4 - iconSize4)/2, (sizePx4 - iconSize4)/2);
		
		// Aplicar o ícone centralizado como background usando LayerDrawable
		LayerDrawable layer4 = new LayerDrawable(new Drawable[]{btnBg4, insetIcon4});
		button4.setBackground(layer4);
		
		// Efeito de clique
		button4.setOnTouchListener(efeitoClique);
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}